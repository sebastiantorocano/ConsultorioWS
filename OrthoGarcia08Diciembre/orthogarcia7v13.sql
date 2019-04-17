-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-11-2015 a las 19:18:00
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `orthogarcia7`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE IF NOT EXISTS `citas` (
  `id_cita` varchar(10) NOT NULL,
  `fecha_cita` date NOT NULL,
  `hora_cita` varchar(2) NOT NULL,
  `minuto_cita` varchar(2) NOT NULL,
  `nombres_pac` varchar(30) NOT NULL,
  `apellidos_pac` varchar(30) NOT NULL,
  `telefono_paciente_cita` varchar(15) NOT NULL,
  `observaciones_cita` text,
  `odontologo_cita` varchar(50) NOT NULL,
  `id_usuario_citas` varchar(10) NOT NULL,
  `id_pac_cita` varchar(15) NOT NULL,
  `servicios` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`id_cita`, `fecha_cita`, `hora_cita`, `minuto_cita`, `nombres_pac`, `apellidos_pac`, `telefono_paciente_cita`, `observaciones_cita`, `odontologo_cita`, `id_usuario_citas`, `id_pac_cita`, `servicios`) VALUES
('3000', '2015-06-03', '15', '30', 'nombre prueba', 'apellido prueba', '2525222', NULL, '', '1152205422', '', 'Limpieza'),
('3001', '2015-06-03', '15', '30', 'nombre prueba', 'apellido prueba', '2525222', NULL, '', '1152205422', '', 'Limpieza'),
('3002', '0000-00-00', '8', '15', 'prueba 2', 'prueba 2', '2524455', '', '', '1152205422', '', 'limpieza'),
('3003', '0000-00-00', '8', '15', 'prueba 3', 'prueba 3', '1122336', '', '', '1152205422', '', 'revision'),
('3004', '0000-00-00', '8', '00', 'Sebastian', 'Toro', '1234455', '', '', '1152205422', '', 'Revision'),
('3005', '2015-08-24', '9', '00', 'juan', 'pablo', '2222222', 'nada', '', '1152205422', '12345', 'limpieza'),
('3006', '2015-08-25', '8', '15', 'juan', 'pablo', '2222222', 'nada', '', '1152205422', '12345', 'limpieza'),
('3007', '2015-08-26', '8', '00', 'juan ', 'pablo', '2222222', 'nada', '', '1152205422', '12345', 'radiografia'),
('3008', '2015-11-21', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos'),
('3009', '2015-11-21', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos'),
('3010', '2015-11-21', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos'),
('3011', '2015-11-21', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos'),
('3012', '2015-11-26', '9', '00', 'prueba nombre', 'prueba apellido', '123456789012345', '', 'juan felipe colon forero', '1152205422', '987654321098765', 'limpieza y resina dos'),
('3013', '2015-11-21', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos'),
('3014', '2015-11-26', '8', '00', 'prueba', 'prueba', '123', '', 'fabian lopera alvarez', '1152205422', '123', 'oeoeoeoe'),
('3015', '2015-11-27', '8', '00', 'prueba', 'prueba', '123', '', 'fabian lopera alvarez', '1152205422', '123', 'oeoeoeoe'),
('3016', '2015-11-26', '17', '45', 'sebastian', 'galeano', '5816895', '', 'fabian lopera alvarez', '1152205422', '1152205426', 'limpieza y resina dos');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
 ADD PRIMARY KEY (`id_cita`), ADD KEY `citas_usuarios_FK` (`id_usuario_citas`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
ADD CONSTRAINT `citas_usuarios_FK` FOREIGN KEY (`id_usuario_citas`) REFERENCES `usuarios` (`cedula_usuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
