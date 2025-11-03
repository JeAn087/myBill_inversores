
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_INVERSION', 500000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_FINANCIAMIENTO', 300000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_INVERSION', 1000000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_FINANCIAMIENTO', 200000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_INVERSION', 150000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_FINANCIAMIENTO', 750000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_INVERSION', 1200000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_FINANCIAMIENTO', 250000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_INVERSION', 900000.00);
INSERT INTO Cupos (tipoCupo, valorCupo) VALUES ('CUPO_DE_FINANCIAMIENTO', 80000.00);

INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Calle 10 #12-30', 'Cauca', 'Popayán', 'Colombia', '3001112233', 'empresa1@mail.com', '1234567890', 'Frutales del Sur S.A.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Carrera 8 #14-20', 'Valle del Cauca', 'Cali', 'Colombia', '3012223344', 'empresa2@mail.com', '2345678901', 'Café Andino Ltda.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Av. Santander #45-67', 'Risaralda', 'Pereira', 'Colombia', '3023334455', 'empresa3@mail.com', '3456789012', 'Textiles del Eje S.A.S.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Calle 5 #9-14', 'Antioquia', 'Medellín', 'Colombia', '3034445566', 'empresa4@mail.com', '4567890123', 'Constructora Andina S.A.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Carrera 7 #15-80', 'Cundinamarca', 'Bogotá', 'Colombia', '3045556677', 'empresa5@mail.com', '5678901234', 'Distribuciones Central Ltda.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Calle 3 #8-50', 'Nariño', 'Pasto', 'Colombia', '3056667788', 'empresa6@mail.com', '6789012345', 'Agroexportadora del Sur S.A.S.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Av. Bolívar #22-45', 'Tolima', 'Ibagué', 'Colombia', '3067778899', 'empresa7@mail.com', '7890123456', 'Panificadora La Mejor S.A.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Calle 20 #10-60', 'Atlántico', 'Barranquilla', 'Colombia', '3078889900', 'empresa8@mail.com', '8901234567', 'Marítimos del Caribe Ltda.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Carrera 12 #7-33', 'Santander', 'Bucaramanga', 'Colombia', '3089990011', 'empresa9@mail.com', '9012345678', 'Maderas del Norte S.A.S.');
INSERT INTO Empresas (direccionDomicilio, departamentoDomicilio, ciudadDomicilio, pais, celular, email, numeroCuenta, razonSocial) VALUES ('Av. Libertad #18-22', 'Magdalena', 'Santa Marta', 'Colombia', '3090001122', 'empresa10@mail.com', '0123456789', 'Turismo Caribe S.A.');

INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2025-12-15', 'DEFINIDO', '2025-11-02', 'Calle 10 #12-30, Popayán', 'Carrera 8 #14-20, Cali', 1500000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2026-01-10', 'POR_DEFINIR', '2025-11-01', 'Cra 7 #8-20, Bogotá', 'Av 3N #25-45, Medellín', 2100000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2025-12-05', 'DEFINIDO', '2025-10-28', 'Calle 12 #5-60, Cali', 'Calle 20 #15-10, Popayán', 875000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2025-11-30', 'POR_DEFINIR', '2025-10-25', 'Av Santander #45-30, Manizales', 'Calle 80 #22-40, Bogotá', 1250000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2026-02-10', 'DEFINIDO', '2025-11-02', 'Carrera 10 #14-22, Armenia', 'Calle 6 #8-45, Cali', 3200000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2025-12-20', 'POR_DEFINIR', '2025-11-02', 'Calle 5 #9-55, Neiva', 'Carrera 2 #18-30, Pasto', 960000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2026-01-25', 'DEFINIDO', '2025-11-02', 'Av 9 #45-60, Medellín', 'Calle 12 #6-10, Bucaramanga', 2750000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2025-12-31', 'POR_DEFINIR', '2025-10-30', 'Calle 15 #8-22, Popayán', 'Carrera 5 #20-15, Pereira', 1850000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2026-03-10', 'DEFINIDO', '2025-11-02', 'Carrera 8 #10-18, Cali', 'Calle 33 #9-70, Bogotá', 4500000.00);
INSERT INTO Facturas (fechaVencimiento, estado, fechaCreacion, dirFacura, dirEnvio, total) VALUES ('2026-01-05', 'POR_DEFINIR', '2025-10-29', 'Calle 25 #7-44, Tunja', 'Av Bolívar #50-12, Popayán', 1100000.00);

INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Carlos Pérez', '1001234567', 'NATURAL');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Inversiones Los Andes S.A.', '900456789-1', 'JURIDICA');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('María Gómez', '1012456789', 'NATURAL');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Global Capital SAS', '901234567-2', 'JURIDICA');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Luis Rodríguez', '1023456789', 'NATURAL');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Fondo Inversor del Cauca', '901987654-3', 'JURIDICA');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Ana Martínez', '1034567890', 'NATURAL');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Colombia Capital Group', '900789123-4', 'JURIDICA');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Juan López', '1045678901', 'NATURAL');
INSERT INTO Inversores (nombreInversor, cedulaInversor, tipoPersona) VALUES ('Finanzas del Pacífico SAS', '901654321-5', 'JURIDICA');

INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Carlos Pérez', '1023456789', 'NATURAL');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Inversiones del Sur S.A.', '900456123', 'JURIDICA');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('María López', '1009876543', 'NATURAL');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Agroindustrias Andinas SAS', '901234789', 'JURIDICA');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Pedro Gómez', '1102233445', 'NATURAL');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Soluciones Financieras del Cauca', '900998877', 'JURIDICA');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Laura Castillo', '1022334455', 'NATURAL');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Tech Services Group LTDA', '901567432', 'JURIDICA');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Julián Muñoz', '1098765432', 'NATURAL');
INSERT INTO Pagadores (nombrePagador, cedulaPagador, tipoPersona) VALUES ('Comercializadora del Pacífico SAS', '901222111', 'JURIDICA');

INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_1234', 'Cuenta_5678', '2025-10-20', 350000.00, 'COMPLETADA');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_2233', 'Cuenta_9988', '2025-10-21', 120000.00, 'EN_REVISION');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_4455', 'Cuenta_6677', '2025-10-22', 980000.00, 'COMPLETADA');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_1122', 'Cuenta_3344', '2025-10-23', 50000.00, 'EN_REVISION');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_9090', 'Cuenta_7878', '2025-10-24', 750000.00, 'COMPLETADA');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_9999', 'Cuenta_1111', '2025-10-25', 240000.00, 'EN_REVISION');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_5555', 'Cuenta_6666', '2025-10-26', 1000000.00, 'COMPLETADA');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_3333', 'Cuenta_4444', '2025-10-27', 150000.00, 'EN_REVISION');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_8888', 'Cuenta_2222', '2025-10-28', 620000.00, 'COMPLETADA');
INSERT INTO Transacciones (origen, destino, fechaTransaccion, monto, estado) VALUES ('Cuenta_1212', 'Cuenta_3434', '2025-10-29', 430000.00, 'EN_REVISION');


INSERT INTO empresa_cupo (idNit, idCupo) VALUES (1, 1);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (2, 2);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (3, 3);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (4, 4);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (5, 5);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (6, 6);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (7, 7);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (8, 8);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (9, 9);
INSERT INTO empresa_cupo (idNit, idCupo) VALUES (10, 10);

INSERT INTO inversor_factura (idInversor, idFactura) VALUES (1, 1);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (1, 2);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (2, 3);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (2, 4);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (3, 5);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (4, 6);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (5, 7);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (6, 8);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (7, 9);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (8, 10);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (9, 3);
INSERT INTO inversor_factura (idInversor, idFactura) VALUES (10, 1);

INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (1, 1);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (1, 2);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (2, 3);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (3, 4);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (3, 5);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (4, 6);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (5, 7);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (6, 8);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (7, 9);
INSERT INTO historial_transacciones (idPagador, idTransaccion) VALUES (8, 10);

INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (1, 1);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (1, 2);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (2, 3);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (3, 1);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (4, 4);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (5, 5);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (6, 2);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (7, 3);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (8, 1);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (9, 4);
INSERT INTO cupos_pagadores (idPagador, idCupo) VALUES (10, 5);