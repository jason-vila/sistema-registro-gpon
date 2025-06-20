DROP DATABASE IF EXISTS registro_gpon_db;
CREATE DATABASE registro_gpon_db;
USE registro_gpon_db;

CREATE TABLE Rol (
    IdRol INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(50) NOT NULL
);

CREATE TABLE Usuario (
    IdUsuario INT PRIMARY KEY AUTO_INCREMENT,
    IdRol INT NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    Correo VARCHAR(255) NOT NULL,
    Contrasena VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
    FOREIGN KEY (IdRol) REFERENCES Rol(IdRol)
);

CREATE TABLE Cliente (
    DniCliente VARCHAR(8) PRIMARY KEY,
    Ruc VARCHAR(11) NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Apellido VARCHAR(255) NOT NULL,
    Telefono VARCHAR(9) NOT NULL
);

CREATE TABLE Plan (
    IdPlan INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE Promocion (
    IdPromocion INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE Distrito (
    IdDistrito INT PRIMARY KEY AUTO_INCREMENT,
    NombreDistrito VARCHAR(255) NOT NULL
);

CREATE TABLE Sector (
    IdSector INT PRIMARY KEY AUTO_INCREMENT,
    NombreSector VARCHAR(255) NOT NULL
);

CREATE TABLE EstadoRegistro (
    IdEstado INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(30) NOT NULL
);

CREATE TABLE RegistroRUC10 (
    IdRegistro INT PRIMARY KEY AUTO_INCREMENT,
    IdUsuario INT NOT NULL,
    Asunto VARCHAR(255) DEFAULT '',
    DniCliente VARCHAR(8) NOT NULL,
    FechaRegistro DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    IdPlan INT NOT NULL,
    IdPromocion INT,
    IdDistrito INT NOT NULL,
    IdSector INT NOT NULL,
    IdSolicitud VARCHAR(255) NOT NULL,
    IdInstalacion VARCHAR(255) NOT NULL,
    IdEstado INT NOT NULL,
    IdCarrito VARCHAR(255) NOT NULL,
    FechaInstalacion DATETIME NOT NULL,
    Observacion VARCHAR(255),
    FOREIGN KEY (IdUsuario) REFERENCES Usuario(IdUsuario),
    FOREIGN KEY (DniCliente) REFERENCES Cliente(DniCliente),
    FOREIGN KEY (IdPlan) REFERENCES Plan(IdPlan),
    FOREIGN KEY (IdPromocion) REFERENCES Promocion(IdPromocion),
    FOREIGN KEY (IdDistrito) REFERENCES Distrito(IdDistrito),
    FOREIGN KEY (IdSector) REFERENCES Sector(IdSector),
    FOREIGN KEY (IdEstado) REFERENCES EstadoRegistro(IdEstado)
);