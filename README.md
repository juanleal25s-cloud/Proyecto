a quien corresponda el tener la base de datos en su computador

CREATE TABLE empleados (
    id_empleado SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido_paterno VARCHAR(50) NOT NULL,
    apellido_materno VARCHAR(50) NOT NULL,
    curp VARCHAR(18) NOT NULL,
    rfc VARCHAR(13) NOT NULL,
    correo VARCHAR(100) UNIQUE,
    telefono VARCHAR(15),
    direccion TEXT,
    codigo_postal VARCHAR(10) NOT NULL,
    sexo VARCHAR(30) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    fecha_contratacion DATE NOT NULL,
    salario DECIMAL(10,2),
    id_puesto INT,
    estado BOOLEAN DEFAULT TRUE
);

CREATE TABLE puestos (
    id_puesto SERIAL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT
);

CREATE TABLE usuarios (
    id_usuario SERIAL PRIMARY KEY,
    usuario VARCHAR(50) UNIQUE NOT NULL,
    contraseña VARCHAR(255) NOT NULL,
    rol VARCHAR(20) NOT NULL,
    id_empleado INT UNIQUE
);

CREATE TABLE asistencias (
    id_asistencia SERIAL PRIMARY KEY,
    id_empleado INT NOT NULL,
    fecha DATE NOT NULL,
    hora_entrada TIME,
    hora_salida TIME,
    estado VARCHAR(20)
);

CREATE TABLE vacaciones (
    id_vacacion SERIAL PRIMARY KEY,
    id_empleado INT NOT NULL,
    fecha_inicio DATE,
    fecha_fin DATE,
    motivo TEXT,
    estado VARCHAR(20)
);

ALTER TABLE empleados
ADD CONSTRAINT fk_puesto
FOREIGN KEY (id_puesto)
REFERENCES puestos(id_puesto);

ALTER TABLE usuarios
ADD CONSTRAINT fk_usuario_empleado
FOREIGN KEY (id_empleado)
REFERENCES empleados(id_empleado);

ALTER TABLE asistencias
ADD CONSTRAINT fk_asistencia_empleado
FOREIGN KEY (id_empleado)
REFERENCES empleados(id_empleado);

ALTER TABLE vacaciones
ADD CONSTRAINT fk_vacaciones_empleado
FOREIGN KEY (id_empleado)
REFERENCES empleados(id_empleado);

CREATE TABLE tareas (
    id_tarea SERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descripcion TEXT,
    id_empleado INT NOT NULL,
    fecha_asignacion DATE DEFAULT CURRENT_DATE,
    fecha_limite DATE,
    estado VARCHAR(20) DEFAULT 'Pendiente',

    CONSTRAINT fk_tarea_empleado
        FOREIGN KEY (id_empleado)
        REFERENCES empleados(id_empleado)
);
