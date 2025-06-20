USE registro_gpon_db;

INSERT INTO Rol(Descripcion) VALUES
('BackOffice'),
('Consultor'),
('Administrador');

INSERT INTO Usuario (IdRol, Nombre, Apellido, Correo, Contrasena) VALUES
(1, 'Juan', 'Pérez', 'juan.perez@example.com', 'clave123'),
(2, 'María', 'Gómez', 'maria.gomez@example.com', 'mariag2023'),
(1, 'Carlos', 'Ramírez', 'carlos.ramirez@example.com', 'passw0rd'),
(3, 'Ana', 'Torres', 'ana.torres@example.com', 'torres456'),
(2, 'Luis', 'Martínez', 'luis.martinez@example.com', 'lmartinez!'),
(1, 'Lucía', 'Fernández', 'lucia.fernandez@example.com', 'lucia12'),
(2, 'Pedro', 'Sánchez', 'pedro.sanchez@example.com', 'pedro123'),
(3, 'Laura', 'Morales', 'laura.morales@example.com', 'lauram!23'),
(1, 'Jorge', 'Cruz', 'jorge.cruz@example.com', 'jorge2023'),
(2, 'Elena', 'Vega', 'elena.vega@example.com', 'elena456'),
(1, 'Diego', 'Castillo', 'diego.castillo@example.com', 'castilloD'),
(3, 'Sofía', 'Herrera', 'sofia.herrera@example.com', 'sofiaH23'),
(2, 'Mateo', 'Flores', 'mateo.flores@example.com', 'flores@12'),
(1, 'Valentina', 'Rojas', 'valentina.rojas@example.com', 'valenR2025'),
(3, 'Andrés', 'Navarro', 'andres.navarro@example.com', 'navarro12'),
(2, 'Camila', 'Silva', 'camila.silva@example.com', 'camilaS'),
(1, 'Sebastián', 'Ibarra', 'sebastian.ibarra@example.com', 'sibarra!'),
(2, 'Daniela', 'Paredes', 'daniela.paredes@example.com', 'danielaP'),
(3, 'Gonzalo', 'Castañeda', 'gonzalo.castaneda@example.com', 'gcast2024'),
(1, 'Natalia', 'Mendoza', 'natalia.mendoza@example.com', 'nataliaM');

INSERT INTO Cliente (DniCliente, Ruc, Nombre, Apellido, Telefono) VALUES
('12345678', '20123456789', 'Juan', 'Pérez', '987654321'),
('23456789', '20456789123', 'María', 'Gómez', '912345678'),
('34567890', '20567891234', 'Carlos', 'Ramírez', '923456789'),
('45678901', '20678912345', 'Ana', 'Torres', '934567890'),
('56789012', '20789123456', 'Luis', 'Martínez', '945678901'),
('67890123', '20891234567', 'Lucía', 'Fernández', '956789012'),
('78901234', '20912345678', 'Pedro', 'Sánchez', '967890123'),
('89012345', '20123456780', 'Laura', 'Morales', '978901234'),
('90123456', '20234567891', 'Jorge', 'Cruz', '989012345'),
('01234567', '20345678912', 'Elena', 'Vega', '900123456'),
('13579246', '20456789124', 'Diego', 'Castillo', '911234567'),
('24681357', '20567891235', 'Sofía', 'Herrera', '922345678'),
('35792468', '20678912346', 'Mateo', 'Flores', '933456789'),
('46813579', '20789123457', 'Valentina', 'Rojas', '944567890'),
('57924680', '20891234568', 'Andrés', 'Navarro', '955678901'),
('68035791', '20912345679', 'Camila', 'Silva', '966789012'),
('79146802', '20123456781', 'Sebastián', 'Ibarra', '977890123'),
('80257913', '20234567892', 'Daniela', 'Paredes', '988901234'),
('91368024', '20345678913', 'Gonzalo', 'Castañeda', '999012345'),
('02479135', '20456789125', 'Natalia', 'Mendoza', '901123456');

INSERT INTO Plan(Descripcion) VALUES ('Internet Fibra Optica 300Mbps');

INSERT INTO Promocion(Descripcion) VALUES ('Descuento cargo fijo 30% x 3meses');

INSERT INTO Distrito (NombreDistrito) VALUES
('Ancón'), ('Ate'), ('Barranco'), ('Breña'), ('Carabayllo'),
('Chaclacayo'), ('Chorrillos'), ('Cieneguilla'), ('Comas'), ('El Agustino'),
('Independencia'), ('Jesús María'), ('La Molina'), ('La Victoria'), ('Lima'),
('Lince'), ('Los Olivos'), ('Lurigancho'), ('Lurín'), ('Magdalena del Mar'),
('Miraflores'), ('Pachacámac'), ('Pucusana'), ('Pueblo Libre'), ('Puente Piedra'),
('Punta Hermosa'), ('Punta Negra'), ('Rímac'), ('San Bartolo'), ('San Borja'),
('San Isidro'), ('San Juan de Lurigancho'), ('San Juan de Miraflores'), ('San Luis'),
('San Martín de Porres'), ('San Miguel'), ('Santa Anita'), ('Santa María del Mar'),
('Santa Rosa'), ('Santiago de Surco'), ('Surquillo'), ('Villa El Salvador'),
('Villa María del Triunfo');

INSERT INTO Sector (NombreSector) VALUES
('Cercado de Lima'), ('La Molina'), ('Miraflores'), ('San Borja'), ('San Isidro'),
('San Miguel'), ('Santiago de Surco'), ('Modern San Isidro'), ('Barrio de Surco'),
('Centro Histórico (Rímac)'), ('Puente Piedra'), ('Villa El Salvador'),
('San Juan de Lurigancho'), ('Comas'), ('Lince'), ('La Victoria'), ('Ate'),
('Chorrillos'), ('Los Olivos'), ('San Martín de Porres'), ('El Agustino'),
('Pueblo Libre'), ('Magdalena del Mar'), ('San Juan de Miraflores'), ('Barranco');

INSERT INTO EstadoRegistro(Descripcion) VALUES
('Pendiente instalacion'),
('Anulado'),
('Observado'),
('Alta por Baja'),
('sin C.E.'),
('Pegado'),
('Sin disponibilidad'),
('Sin cobertura'),
('Deuda');

INSERT INTO RegistroRUC10 (
    IdUsuario, Asunto, DniCliente, FechaRegistro, IdPlan, IdPromocion,
    IdDistrito, IdSector, IdSolicitud, IdInstalacion, IdEstado,
    IdCarrito, FechaInstalacion, Observacion
) VALUES
(1, 'RUC 10 VENTA // 20123456789//JUAN PÉREZ', '12345678', '2025-06-19 09:15:00', 1, 1, 1, 1, '1QWERTYUI', '763952718', 1, 'CSE00130678226', '2025-06-23 14:00:00', ''),
(2, 'RUC 10 VENTA // 20456789123//MARÍA GÓMEZ', '23456789', '2025-06-19 09:20:00', 1, 1, 2, 2, '1ASDFGHJK', '763952719', 3, 'CSE00130678227', '2025-06-23 14:30:00', ''),
(3, 'RUC 10 VENTA // 20567891234//CARLOS RAMÍREZ', '34567890', '2025-06-19 09:25:00', 1, 1, 3, 3, '1ZXCVBNMA', '763952720', 4, 'CSE00130678228', '2025-06-23 15:00:00', ''),
(4, 'RUC 10 VENTA // 20678912345//ANA TORRES', '45678901', '2025-06-19 09:30:00', 1, 1, 4, 4, '1QAZWSXED', '763952721', 2, 'CSE00130678229', '2025-06-23 15:30:00', ''),
(5, 'RUC 10 VENTA // 20789123456//LUIS MARTÍNEZ', '56789012', '2025-06-19 09:35:00', 1, 1, 5, 5, '1EDCRFVTG', '763952722', 5, 'CSE00130678230', '2025-06-23 16:00:00', ''),
(6, 'RUC 10 VENTA // 20891234567//LUCÍA FERNÁNDEZ', '67890123', '2025-06-19 09:40:00', 1, 1, 6, 6, '1TGBYHNUJ', '763952723', 6, 'CSE00130678231', '2025-06-23 16:30:00', ''),
(7, 'RUC 10 VENTA // 20912345678//PEDRO SÁNCHEZ', '78901234', '2025-06-19 09:45:00', 1, 1, 7, 7, '1PLMOKNIJ', '763952724', 7, 'CSE00130678232', '2025-06-23 17:00:00', ''),
(8, 'RUC 10 VENTA // 20123456780//LAURA MORALES', '89012345', '2025-06-19 09:50:00', 1, 1, 8, 8, '1MNBVCXZA', '763952725', 8, 'CSE00130678233', '2025-06-23 17:30:00', ''),
(9, 'RUC 10 VENTA // 20234567891//JORGE CRUZ', '90123456', '2025-06-19 09:55:00', 1, 1, 9, 9, '1LOKMIJNU', '763952726', 9, 'CSE00130678234', '2025-06-23 18:00:00', ''),
(10, 'RUC 10 VENTA // 20345678912//ELENA VEGA', '01234567', '2025-06-19 10:00:00', 1, 1, 10, 10, '1BVCXZAQW', '763952727', 1, 'CSE00130678235', '2025-06-23 18:30:00', '');