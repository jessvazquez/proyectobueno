-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-11-2019 a las 03:27:55
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.2.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `esproyecto`
--
CREATE DATABASE IF NOT EXISTS `esproyecto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `esproyecto`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE IF NOT EXISTS `administradores` (
  `nombre` varchar(100) NOT NULL,
  `edad` int(10) NOT NULL,
  `turno` varchar(30) NOT NULL,
  `area` varchar(50) NOT NULL,
  `numeroEmpleado` int(10) NOT NULL,
  `contrasena` varchar(12) NOT NULL,
  PRIMARY KEY (`numeroEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`nombre`, `edad`, `turno`, `area`, `numeroEmpleado`, `contrasena`) VALUES
('admin', 0, 'NA', 'NA', 1234, 'hola'),
('David Vazquez Salas', 0, 'NA', 'NA', 1522726, 'qwerty');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `turno` varchar(20) NOT NULL,
  `numeroEmpleado` int(8) NOT NULL,
  `area` varchar(20) NOT NULL,
  `horaEntrada` varchar(20) NOT NULL,
  `horaSalida` varchar(20) NOT NULL,
  PRIMARY KEY (`numeroEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`nombre`, `edad`, `turno`, `numeroEmpleado`, `area`, `horaEntrada`, `horaSalida`) VALUES
('oo', 12, 'o', 45, 'o', 'o', 'o'),
('Mauro Sanchez Sanchez', 45, 'vespertino', 12345, 'Desarrollo', 'dads', 'sadas'),
('david', 12, 'ver', 1522726, 'Mantenimiento', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
