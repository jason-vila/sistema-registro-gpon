CREATE DATABASE registro_gpon_db;
USE registro_gpon_db;

CREATE TABLE Rol (
    IdRol INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(100)
);

CREATE TABLE Usuario (
    IdUsuario INT PRIMARY KEY AUTO_INCREMENT,
    IdRol INT,
    Nombre VARCHAR(100),
    Apellido VARCHAR(100),
    Correo VARCHAR(100),
    Contrasena VARCHAR(100),
    FOREIGN KEY (IdRol) REFERENCES Rol(IdRol)
);

CREATE TABLE Cliente (
    DniCliente VARCHAR(20) PRIMARY KEY,
    Ruc VARCHAR(20),
    Nombre VARCHAR(100),
    Apellido VARCHAR(100),
    Telefono VARCHAR(20)
);

CREATE TABLE Plan (
    IdPlan INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(100)
);

CREATE TABLE Promocion (
    IdPromocion INT PRIMARY KEY AUTO_INCREMENT,
    Descripcion VARCHAR(100)
);

CREATE TABLE Distrito (
    IdDistrito INT PRIMARY KEY AUTO_INCREMENT,
    NombreDistrito VARCHAR(100)
);

CREATE TABLE Sector (
    IdSector INT PRIMARY KEY AUTO_INCREMENT,
    NombreSector VARCHAR(100)
);

CREATE TABLE RegistroRUC10 (
    IdRegistro INT PRIMARY KEY AUTO_INCREMENT,
    IdUsuario INT,
    Asunto VARCHAR(255),
    DniCliente VARCHAR(20),
    FechaRegistro DATE,
    IdPlan INT,
    IdPromocion INT,
    IdDistrito INT,
    IdSector INT,
    IdSolicitud INT,
    IdInstalacion INT,
    Estado VARCHAR(50),
    IdCarrito INT,
    FechaInstalacion DATE,
    Observacion TEXT,
    FOREIGN KEY (IdUsuario) REFERENCES Usuario(IdUsuario),
    FOREIGN KEY (DniCliente) REFERENCES Cliente(DniCliente),
    FOREIGN KEY (IdPlan) REFERENCES Plan(IdPlan),
    FOREIGN KEY (IdPromocion) REFERENCES Promocion(IdPromocion),
    FOREIGN KEY (IdDistrito) REFERENCES Distrito(IdDistrito),
    FOREIGN KEY (IdSector) REFERENCES Sector(IdSector)
);