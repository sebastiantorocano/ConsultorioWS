-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-08-2015 a las 00:13:45
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
  `observaciones_cita` varchar(30) DEFAULT NULL,
  `id_usuario_citas` varchar(10) NOT NULL,
  `id_pac_cita` varchar(15) DEFAULT NULL,
  `servicios` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`id_cita`, `fecha_cita`, `hora_cita`, `minuto_cita`, `nombres_pac`, `apellidos_pac`, `telefono_paciente_cita`, `observaciones_cita`, `id_usuario_citas`, `id_pac_cita`, `servicios`) VALUES
('3000', '2015-06-03', '15', '30', 'nombre prueba', 'apellido prueba', '2525222', NULL, '1152205422', NULL, 'Limpieza'),
('3001', '2015-06-03', '15', '30', 'nombre prueba', 'apellido prueba', '2525222', NULL, '1152205422', NULL, 'Limpieza'),
('3002', '0000-00-00', '8', '15', 'prueba 2', 'prueba 2', '2524455', '', '1152205422', '', 'limpieza'),
('3003', '0000-00-00', '8', '15', 'prueba 3', 'prueba 3', '1122336', '', '1152205422', '', 'revision'),
('3004', '0000-00-00', '8', '00', 'Sebastian', 'Toro', '1234455', '', '1152205422', '', 'Revision'),
('3005', '0000-00-00', '9', '00', 'juan', 'pablo', '2222222', 'nada', '1152205422', '12345', 'limpieza'),
('3006', '0000-00-00', '8', '15', 'juan', 'pablo', '2222222', 'nada', '1152205422', '12345', 'limpieza'),
('3007', '0000-00-00', '8', '00', 'juan ', 'pablo', '2222222', 'nada', '1152205422', '12345', 'radiografia'),
('3008', '2015-08-29', '8', '45', 'sebastian', 'galeano', '5816895', 'bbb', '1152205422', '1152205426', 'bbbb'),
('3009', '2015-08-30', '8', '00', 'sebastian', 'galeano', '5816895', 'bien', '1152205422', '1152205426', 'limpieza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas_radiografias`
--

CREATE TABLE IF NOT EXISTS `citas_radiografias` (
  `id_cita_cr` varchar(10) NOT NULL,
  `id_radiografia_cr` varchar(15) NOT NULL,
  `observaciones_cr` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `citas_radiografias`
--

INSERT INTO `citas_radiografias` (`id_cita_cr`, `id_radiografia_cr`, `observaciones_cr`) VALUES
('3001', '28000', 'Amputar'),
('3004', '28006', ''),
('3004', '28007', ''),
('3005', '28002', 'obstrupciòn'),
('3006', '28001', 'diente partido'),
('3007', '28003', 'hueso en mal estado'),
('3007', '28004', 'prueba'),
('3007', '28005', 'inclinaciòn de diente'),
('3009', '28008', ''),
('3009', '28009', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE IF NOT EXISTS `estados` (
  `id_estado` varchar(15) NOT NULL,
  `nombre_estado` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`id_estado`, `nombre_estado`) VALUES
('10000', 'activo'),
('11000', 'inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_civil`
--

CREATE TABLE IF NOT EXISTS `estado_civil` (
  `id_estado_civil` varchar(15) NOT NULL,
  `nombre_estado_civil` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_civil`
--

INSERT INTO `estado_civil` (`id_estado_civil`, `nombre_estado_civil`) VALUES
('29000', 'Soltero'),
('30000', 'Casado'),
('31000', 'Union libre');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genero`
--

CREATE TABLE IF NOT EXISTS `genero` (
  `id_genero` varchar(15) NOT NULL,
  `nombre_genero` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `genero`
--

INSERT INTO `genero` (`id_genero`, `nombre_genero`) VALUES
('32000', 'Masculino'),
('33000', 'Femenino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales_consultorio`
--

CREATE TABLE IF NOT EXISTS `materiales_consultorio` (
  `id_matcon` varchar(10) NOT NULL,
  `nombre_matcon` varchar(30) NOT NULL,
  `id_usuario_matcon` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materiales_consultorio`
--

INSERT INTO `materiales_consultorio` (`id_matcon`, `nombre_matcon`, `id_usuario_matcon`) VALUES
('2000', 'prueba matcon', '1152205422'),
('2003', 'mat', '1152205422'),
('2004', 'dientes postizos', '1152205420'),
('2005', 'calzas blancas', '1152205420');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medidas_esq_tej_blandos_dent`
--

CREATE TABLE IF NOT EXISTS `medidas_esq_tej_blandos_dent` (
  `id_med_esq` varchar(10) NOT NULL,
  `steiner_med_esq` varchar(10) DEFAULT NULL,
  `vnor_med_esq` varchar(20) DEFAULT NULL,
  `in_med_esq` char(1) DEFAULT NULL,
  `int_med_esq` char(1) DEFAULT NULL,
  `fin_med_esq` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medidas_esq_tej_blandos_dent`
--

INSERT INTO `medidas_esq_tej_blandos_dent` (`id_med_esq`, `steiner_med_esq`, `vnor_med_esq`, `in_med_esq`, `int_med_esq`, `fin_med_esq`) VALUES
('21000', 'sna', '82°+/-2', NULL, NULL, NULL),
('22000', 'snb', '80°+/-2', NULL, NULL, NULL),
('23000', 'anb', '2+/-2', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metbd_hc`
--

CREATE TABLE IF NOT EXISTS `metbd_hc` (
  `id_metbd` varchar(10) NOT NULL,
  `num_doc_metbd` varchar(15) NOT NULL,
  `diagnostico_med_esq` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `metbd_hc`
--

INSERT INTO `metbd_hc` (`id_metbd`, `num_doc_metbd`, `diagnostico_med_esq`) VALUES
('21000', '1152205423', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `odontogramas`
--

CREATE TABLE IF NOT EXISTS `odontogramas` (
  `id_odontograma` varchar(10) NOT NULL,
  `tipo_odontograma` varchar(1) NOT NULL,
  `diente_18` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_17` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_16` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_15` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_14` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_13` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_12` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_11` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_55` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_54` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_53` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_52` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_51` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_21` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_22` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_23` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_24` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_25` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_26` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_27` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_28` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_61` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_62` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_63` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_64` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_65` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_85` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_84` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_83` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_82` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_81` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_48` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_47` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_46` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_45` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_44` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_43` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_42` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_41` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_71` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_72` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_73` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_74` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_75` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_31` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_32` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_33` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_34` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_35` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_36` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_37` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0',
  `diente_38` varchar(10) NOT NULL DEFAULT 's0s0s0s0s0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `odontogramas`
--

INSERT INTO `odontogramas` (`id_odontograma`, `tipo_odontograma`, `diente_18`, `diente_17`, `diente_16`, `diente_15`, `diente_14`, `diente_13`, `diente_12`, `diente_11`, `diente_55`, `diente_54`, `diente_53`, `diente_52`, `diente_51`, `diente_21`, `diente_22`, `diente_23`, `diente_24`, `diente_25`, `diente_26`, `diente_27`, `diente_28`, `diente_61`, `diente_62`, `diente_63`, `diente_64`, `diente_65`, `diente_85`, `diente_84`, `diente_83`, `diente_82`, `diente_81`, `diente_48`, `diente_47`, `diente_46`, `diente_45`, `diente_44`, `diente_43`, `diente_42`, `diente_41`, `diente_71`, `diente_72`, `diente_73`, `diente_74`, `diente_75`, `diente_31`, `diente_32`, `diente_33`, `diente_34`, `diente_35`, `diente_36`, `diente_37`, `diente_38`) VALUES
('12000', 'I', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0', 's0s0s0s0s0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `odontograma_cita`
--

CREATE TABLE IF NOT EXISTS `odontograma_cita` (
  `id_cita_oc` varchar(10) NOT NULL,
  `id_odontograma_oc` varchar(10) NOT NULL,
  `observaciones_odont_oc` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `odontograma_cita`
--

INSERT INTO `odontograma_cita` (`id_cita_oc`, `id_odontograma_oc`, `observaciones_odont_oc`) VALUES
('3001', '12000', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE IF NOT EXISTS `pacientes` (
  `numero_doc_paciente` varchar(15) NOT NULL,
  `cedula_usuario_paciente` varchar(10) NOT NULL,
  `fecha_ingreso_paciente` date NOT NULL,
  `tipo_doc_paciente` varchar(15) NOT NULL,
  `genero_paciente` varchar(15) NOT NULL,
  `estado_civil_paciente` varchar(15) NOT NULL,
  `apellido_paciente` varchar(30) NOT NULL,
  `nombre_paciente` varchar(30) NOT NULL,
  `edad_paciente` varchar(2) NOT NULL,
  `fecha_nac_paciente` date NOT NULL,
  `dir_residencia_paciente` varchar(60) NOT NULL,
  `ciudad_paciente` varchar(15) NOT NULL,
  `barrio_paciente` varchar(20) NOT NULL,
  `telefono_paciente` varchar(10) NOT NULL,
  `celular_paciente` varchar(15) NOT NULL,
  `correo_paciente` varchar(60) DEFAULT NULL,
  `eps_paciente` varchar(50) NOT NULL,
  `ocupacion_paciente` varchar(20) NOT NULL,
  `empresa_paciente` varchar(30) DEFAULT NULL,
  `tel_empresa_paciente` varchar(10) DEFAULT NULL,
  `nom_responsable_paciente` varchar(50) NOT NULL,
  `doc_ident_resp_paciente` varchar(15) NOT NULL,
  `tel_resp_paciente` varchar(10) NOT NULL,
  `dir_resp_paciente` varchar(60) NOT NULL,
  `referido_paciente` varchar(50) DEFAULT NULL,
  `caso_urg_aviso_paciente` varchar(50) NOT NULL,
  `dir_urg_aviso_paciente` varchar(60) NOT NULL,
  `tel_urg_aviso_paciente` varchar(15) NOT NULL,
  `motivo_consulta_paciente` varchar(60) NOT NULL,
  `evol_est_actual_paciente` varchar(50) DEFAULT NULL,
  `antec_fam_paciente` varchar(60) DEFAULT NULL,
  `id_estado_paciente` varchar(15) NOT NULL DEFAULT '10000',
  `num_hc` varchar(15) NOT NULL,
  `alergias_o_m` char(1) DEFAULT NULL,
  `discrasia_sanguinea_o_m` char(1) DEFAULT NULL,
  `cardiopatias_o_m` char(1) DEFAULT NULL,
  `embarazo_o_m` char(1) DEFAULT NULL,
  `alter_pres_arterial_o_m` char(1) DEFAULT NULL,
  `toma_medicamentos_o_m` char(1) DEFAULT NULL,
  `trat_med_actual_o_m` char(1) DEFAULT NULL,
  `hepatitis_o_m` char(1) DEFAULT NULL,
  `diabetes_o_m` char(1) DEFAULT NULL,
  `fiebre_reumatica_o_m` char(1) DEFAULT NULL,
  `hiv_sida_o_m` char(1) DEFAULT NULL,
  `inmunosupresion_o_m` char(1) DEFAULT NULL,
  `patologias_renales_o_m` char(1) DEFAULT NULL,
  `patologias_respiratorias_o_m` char(1) DEFAULT NULL,
  `trastornos_gastricos_o_m` char(1) DEFAULT NULL,
  `trastornos_emocionales_o_m` char(1) DEFAULT NULL,
  `sinusitis_o_m` char(1) DEFAULT NULL,
  `cirugias_o_m` char(1) DEFAULT NULL,
  `exodoncias_o_m` char(1) DEFAULT NULL,
  `enfermedades_orales_o_m` char(1) DEFAULT NULL,
  `protesis_aparotologia_o_m` char(1) DEFAULT NULL,
  `otras_pat_antec_o_m` varchar(60) DEFAULT NULL,
  `observaciones_o_m` varchar(60) DEFAULT NULL,
  `habitos_asociados_o_m` varchar(60) DEFAULT NULL,
  `labio_superior_e_e` char(1) DEFAULT NULL,
  `labio_inferior_e_e` char(1) DEFAULT NULL,
  `comisuras_e_e` char(1) DEFAULT NULL,
  `mucosa_oral_e_e` char(1) DEFAULT NULL,
  `surcos_yugales_e_e` char(1) DEFAULT NULL,
  `frenillos_e_e` char(1) DEFAULT NULL,
  `orofaringe_e_e` char(1) DEFAULT NULL,
  `paladar_e_e` char(1) DEFAULT NULL,
  `glandulas_salivales_e_e` char(1) DEFAULT NULL,
  `piso_boca_e_e` char(1) DEFAULT NULL,
  `dorso_lengua_e_e` char(1) DEFAULT NULL,
  `vientre_lengua_e_e` char(1) DEFAULT NULL,
  `observaciones_e_e` varchar(60) DEFAULT NULL,
  `ruidos_atm` char(1) DEFAULT NULL,
  `desviacion_atm` char(1) DEFAULT NULL,
  `cambio_volumen_atm` char(1) DEFAULT NULL,
  `bloqueo_mandibular_atm` char(1) DEFAULT NULL,
  `limitacion_apertura_atm` char(1) DEFAULT NULL,
  `dolor_articular_atm` char(1) DEFAULT NULL,
  `dolor_muscular_atm` char(1) DEFAULT NULL,
  `observaciones_atm` varchar(60) DEFAULT NULL,
  `cariados_cops` varchar(2) DEFAULT NULL,
  `obturados_cops` varchar(2) DEFAULT NULL,
  `extraidos_cops` varchar(2) DEFAULT NULL,
  `sanos_cops` varchar(2) DEFAULT NULL,
  `cariados_ceo` varchar(2) DEFAULT NULL,
  `obturados_ceo` varchar(2) DEFAULT NULL,
  `perdidos_ceo` varchar(2) DEFAULT NULL,
  `sanos_ceo` varchar(2) DEFAULT NULL,
  `dientes_ret_imp_ar` char(1) DEFAULT NULL,
  `cual_diente_ret_imp_ar` varchar(10) DEFAULT NULL,
  `dientes_supernum_ar` char(1) DEFAULT NULL,
  `cual_dientes_supernum_ar` varchar(10) DEFAULT NULL,
  `long_rad_dism_ar` char(1) DEFAULT NULL,
  `cual_long_rad_dis_ar` varchar(10) DEFAULT NULL,
  `observaciones_ar` varchar(50) DEFAULT NULL,
  `perfil_esqueletico_ac` varchar(10) DEFAULT NULL,
  `prognatismo_ac` char(1) DEFAULT NULL,
  `retrognatismo_ac` char(1) DEFAULT NULL,
  `tipo_crecimiento_ac` char(1) DEFAULT NULL,
  `altura_facial_inf_ac` char(1) DEFAULT NULL,
  `protrusion_dentario` char(1) DEFAULT NULL,
  `retrusion_dentario` char(1) DEFAULT NULL,
  `perfil_tejidos_blandos` varchar(20) DEFAULT NULL,
  `proquelia_tejidos_blandos` char(1) DEFAULT NULL,
  `retroquelia_tejidos_blandos` char(1) DEFAULT NULL,
  `tipo_denticion_am` varchar(10) DEFAULT NULL,
  `morf_arco_triang_am` char(1) DEFAULT NULL,
  `morf_arco_cuadr_am` char(1) DEFAULT NULL,
  `morf_arco_ovoi_am` char(1) DEFAULT NULL,
  `tam_dental_normal_am` char(1) DEFAULT NULL,
  `tam_dental_macrodoncia_am` char(1) DEFAULT NULL,
  `tam_dental_microdoncia_am` char(1) DEFAULT NULL,
  `rmc_canino_am` varchar(10) DEFAULT NULL,
  `rmc_molar_am` varchar(10) DEFAULT NULL,
  `rmc_lineamedia_izq` varchar(2) DEFAULT '0',
  `rmc_lineamedia_der` varchar(2) DEFAULT '0',
  `overjet_am` varchar(20) DEFAULT NULL,
  `ovebite_am` varchar(20) DEFAULT NULL,
  `mordida_cruzada_am` varchar(20) DEFAULT NULL,
  `apinamiento_sup_am` varchar(10) DEFAULT NULL,
  `apinamiento_inf_am` varchar(10) DEFAULT NULL,
  `diastemas_sup_am` varchar(10) DEFAULT NULL,
  `diastemas_inf_am` varchar(10) DEFAULT NULL,
  `malposiciones_am` varchar(25) DEFAULT NULL,
  `observaciones_am` varchar(30) DEFAULT NULL,
  `diagnostico_esqueletico` varchar(50) DEFAULT NULL,
  `diagnostico_facial` varchar(50) DEFAULT NULL,
  `diagnostico_dental` varchar(50) DEFAULT NULL,
  `diagnostico_funcional` varchar(50) DEFAULT NULL,
  `plan_tratamiento` varchar(100) DEFAULT NULL,
  `objetivos_tratamiento` varchar(50) DEFAULT NULL,
  `limites_corregir` varchar(50) DEFAULT NULL,
  `medidas_esqueletica_ac` varchar(10) DEFAULT NULL,
  `medidas_tejidos_blandos_ac` varchar(10) DEFAULT NULL,
  `medidas_dentarias_ac` varchar(10) DEFAULT NULL,
  `diagnostico_ac` varchar(50) DEFAULT NULL,
  `id_radiografia` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`numero_doc_paciente`, `cedula_usuario_paciente`, `fecha_ingreso_paciente`, `tipo_doc_paciente`, `genero_paciente`, `estado_civil_paciente`, `apellido_paciente`, `nombre_paciente`, `edad_paciente`, `fecha_nac_paciente`, `dir_residencia_paciente`, `ciudad_paciente`, `barrio_paciente`, `telefono_paciente`, `celular_paciente`, `correo_paciente`, `eps_paciente`, `ocupacion_paciente`, `empresa_paciente`, `tel_empresa_paciente`, `nom_responsable_paciente`, `doc_ident_resp_paciente`, `tel_resp_paciente`, `dir_resp_paciente`, `referido_paciente`, `caso_urg_aviso_paciente`, `dir_urg_aviso_paciente`, `tel_urg_aviso_paciente`, `motivo_consulta_paciente`, `evol_est_actual_paciente`, `antec_fam_paciente`, `id_estado_paciente`, `num_hc`, `alergias_o_m`, `discrasia_sanguinea_o_m`, `cardiopatias_o_m`, `embarazo_o_m`, `alter_pres_arterial_o_m`, `toma_medicamentos_o_m`, `trat_med_actual_o_m`, `hepatitis_o_m`, `diabetes_o_m`, `fiebre_reumatica_o_m`, `hiv_sida_o_m`, `inmunosupresion_o_m`, `patologias_renales_o_m`, `patologias_respiratorias_o_m`, `trastornos_gastricos_o_m`, `trastornos_emocionales_o_m`, `sinusitis_o_m`, `cirugias_o_m`, `exodoncias_o_m`, `enfermedades_orales_o_m`, `protesis_aparotologia_o_m`, `otras_pat_antec_o_m`, `observaciones_o_m`, `habitos_asociados_o_m`, `labio_superior_e_e`, `labio_inferior_e_e`, `comisuras_e_e`, `mucosa_oral_e_e`, `surcos_yugales_e_e`, `frenillos_e_e`, `orofaringe_e_e`, `paladar_e_e`, `glandulas_salivales_e_e`, `piso_boca_e_e`, `dorso_lengua_e_e`, `vientre_lengua_e_e`, `observaciones_e_e`, `ruidos_atm`, `desviacion_atm`, `cambio_volumen_atm`, `bloqueo_mandibular_atm`, `limitacion_apertura_atm`, `dolor_articular_atm`, `dolor_muscular_atm`, `observaciones_atm`, `cariados_cops`, `obturados_cops`, `extraidos_cops`, `sanos_cops`, `cariados_ceo`, `obturados_ceo`, `perdidos_ceo`, `sanos_ceo`, `dientes_ret_imp_ar`, `cual_diente_ret_imp_ar`, `dientes_supernum_ar`, `cual_dientes_supernum_ar`, `long_rad_dism_ar`, `cual_long_rad_dis_ar`, `observaciones_ar`, `perfil_esqueletico_ac`, `prognatismo_ac`, `retrognatismo_ac`, `tipo_crecimiento_ac`, `altura_facial_inf_ac`, `protrusion_dentario`, `retrusion_dentario`, `perfil_tejidos_blandos`, `proquelia_tejidos_blandos`, `retroquelia_tejidos_blandos`, `tipo_denticion_am`, `morf_arco_triang_am`, `morf_arco_cuadr_am`, `morf_arco_ovoi_am`, `tam_dental_normal_am`, `tam_dental_macrodoncia_am`, `tam_dental_microdoncia_am`, `rmc_canino_am`, `rmc_molar_am`, `rmc_lineamedia_izq`, `rmc_lineamedia_der`, `overjet_am`, `ovebite_am`, `mordida_cruzada_am`, `apinamiento_sup_am`, `apinamiento_inf_am`, `diastemas_sup_am`, `diastemas_inf_am`, `malposiciones_am`, `observaciones_am`, `diagnostico_esqueletico`, `diagnostico_facial`, `diagnostico_dental`, `diagnostico_funcional`, `plan_tratamiento`, `objetivos_tratamiento`, `limites_corregir`, `medidas_esqueletica_ac`, `medidas_tejidos_blandos_ac`, `medidas_dentarias_ac`, `diagnostico_ac`, `id_radiografia`) VALUES
('111', '1152205420', '2015-08-01', '35000', '32000', '29000', 'a', 'a', '1', '2015-08-29', 'aaa', 'aaa', 'aaaa', '123', '132', 'aa', 'aaa', 'aaa', 'aaa', '1121', 'aaaa', '121', '2133', 'aa1', 'aaa', 'aaa', '2131a', '123', 'aaaa', '', '', '10000', '13', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 's', 'n', 'n', 'n', 'n', 'n', 's', 'n', 'n', 'n', 'n', 'n', 'n', 's', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1152205423', '1152205420', '2015-06-03', '35000', '32000', '29000', 'prueba apellido', 'prueba nombre', '25', '1990-04-24', 'calle prueba #123', '26000', '25000', '2525223', '3004007080', 'correo@prueba.com', 'sura', 'estudiante', NULL, NULL, 'prueba responsable', '1152205424', '2525224', 'calle prueba #123', NULL, 'aviso prueba', 'calle prueba #123', '2525224', 'ortodoncia', NULL, NULL, '10000', '34000', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', NULL, 's', 's', 's', 's', 's', 's', 's', NULL, '0', '0', '0', '15', '0', '0', '0', '15', 'n', NULL, 'n', NULL, 'n', NULL, NULL, 'CI.I', '1', '0', '0', '0', '1', '0', 'prueba perfil', '1', '0', 'Temporal', '1', '0', '0', '1', '1', '0', '20000', '24000', '0', '0', 'overjet p', 'ovebite p', 'mordida cruazada p', 'apin sup p', 'apin inf p', 'dias sup p', 'dias inf p', 'malposiciones prueba', NULL, 'sano', 'sano', 'sano', 'sano', 'plan tratamiento prueba', 'objetivos prueba', 'limites prueba', '21000', '22000', '23000', 'prueba diagnostico ac', '28000'),
('1152205426', '1152205420', '2015-07-23', '34000', '32000', '29000', 'galeano', 'sebastian', '21', '1994-07-27', 'medellin', 'medellin', 'juan 23', '5816895', '3004915735', 'galesebas@gmail.com', 'sura', 'estudiante', '', '', 'Adriana bolivar', '71686517', '5816895', 'calle 48 dd # 99 58', '', 'Julian Galeano', 'calle 48 dd # 99 58', '5816895', 'revision', '', '', '10000', '142536', 's', 'n', 'n', 'n', 'n', 'n', 'n', 'n', 's', 'n', 'n', 'n', 'n', 'n', 's', 'n', 'n', 'n', 'n', 'n', 'n', 'aaa', 'aaa', 'aaa', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', 's', 'todo bien', 's', 's', 's', 's', 's', 's', 's', 'todo bien', '', '', '', '32', '1', '', '', '31', 'n', '', 'n', '', 'n', '', 'aaaa', 'CI.I', 'x', 'x', 'v', 'a', 's', 's', NULL, 's', 's', 'Temporal', 's', 's', 's', 's', 's', 's', 'i1', 'd1', '1', '1', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'aa', 'a', 'a', 'a', 'a', 'a', 'a', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE IF NOT EXISTS `proveedores` (
  `id_proveedor` varchar(20) NOT NULL,
  `nombre_proveedor` varchar(50) NOT NULL,
  `contacto_proveedor` varchar(20) NOT NULL,
  `direccion_proveedor` varchar(20) NOT NULL,
  `id_usuario_proveedor` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`id_proveedor`, `nombre_proveedor`, `contacto_proveedor`, `direccion_proveedor`, `id_usuario_proveedor`) VALUES
('1000', 'prueba proveedor', '3004005060', 'calle prueba # 123', '1152205422'),
('2000', 'familia', '2222222', 'calle 5410', NULL),
('2001', 'dental_solutions', '2231215', 'calle 58 b # 12 c', '1213');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor_materiales`
--

CREATE TABLE IF NOT EXISTS `proveedor_materiales` (
  `id_proveedor_pm` varchar(20) NOT NULL,
  `id_mat_pm` varchar(10) NOT NULL,
  `cantidad_inventario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedor_materiales`
--

INSERT INTO `proveedor_materiales` (`id_proveedor_pm`, `id_mat_pm`, `cantidad_inventario`) VALUES
('1000', '2000', 15),
('2000', '2003', 15),
('2001', '2004', 50),
('2001', '2005', 40);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `radiografias`
--

CREATE TABLE IF NOT EXISTS `radiografias` (
  `id_radiografia` varchar(15) NOT NULL DEFAULT '',
  `tipo_radiografia` varchar(50) NOT NULL,
  `url_radiografia` varchar(300) NOT NULL,
  `id_paciente_radiografia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `radiografias`
--

INSERT INTO `radiografias` (`id_radiografia`, `tipo_radiografia`, `url_radiografia`, `id_paciente_radiografia`) VALUES
('2009', '', '', ''),
('28000', '', '', ''),
('28001', 'Panoramica.', 'C://Users//USUARIO//Desktop//OrthoGarcia10agosto//src//Radiografias//radiografia-panoramica-mini.jpg', '12345'),
('28002', 'Panoramica.', 'C://Users//USUARIO//Desktop//OrthoGarcia10agosto//src//Radiografias//radiografia-panoramica-mini.jpg', '12345'),
('28003', 'Cefàlica lateral.', 'C://Users//USUARIO//Desktop//OrthoGarcia10agosto//src//Radiografias//cefalica_lateral.jpg', '12345'),
('28004', 'Cefàlica lateral.', 'C://Users//USUARIO//Desktop//OrthoGarcia10agosto//src//Radiografias//cefalica_lateral.jpg', '12345'),
('28005', 'Cefàlica lateral.', 'C://Users//USUARIO//Desktop//OrthoGarcia10agosto//src//Radiografias//radio_cefalica.jpg', '12345'),
('28006', 'Panoramica.', 'D://portatil//tian al cel//1CZUQU4DVT711436217116016.jpg', '1152205426'),
('28007', 'Cefàlica lateral.', 'D://portatil//tian al cel//04-2sC0t9p.jpg', '1152205426'),
('28008', 'Panoramica.', 'D://portatil//tian al cel//08-5dXPkkW.jpg', '1152205426'),
('28009', 'Cefàlica lateral.', 'D://portatil//tian al cel//3116.jpg', '1152205426');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguimiento_hc`
--

CREATE TABLE IF NOT EXISTS `seguimiento_hc` (
  `id_seg_hc` varchar(15) NOT NULL,
  `num_doc_seg` varchar(15) NOT NULL,
  `evolucion_historia` varchar(50) NOT NULL,
  `fecha_seguimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `seguimiento_hc`
--

INSERT INTO `seguimiento_hc` (`id_seg_hc`, `num_doc_seg`, `evolucion_historia`, `fecha_seguimiento`) VALUES
('37000', '1152205423', 'Evolucion chevere', '2015-06-03'),
('37001', '1152205426', 'prueba', '2015-08-19');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_documento`
--

CREATE TABLE IF NOT EXISTS `tipo_documento` (
  `id_tipo_doc` varchar(15) NOT NULL,
  `nombre_tipo_doc` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo_documento`
--

INSERT INTO `tipo_documento` (`id_tipo_doc`, `nombre_tipo_doc`) VALUES
('34000', 'CC'),
('35000', 'TI'),
('36000', 'RC');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `cedula_usuario` varchar(10) NOT NULL,
  `nombre_usuario` varchar(25) NOT NULL,
  `p_apellido_usuario` varchar(25) NOT NULL,
  `s_apellido_usuario` varchar(25) DEFAULT NULL,
  `cargo_usuario` varchar(20) NOT NULL,
  `especialidad_usuario` varchar(30) DEFAULT NULL,
  `contrasena` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cedula_usuario`, `nombre_usuario`, `p_apellido_usuario`, `s_apellido_usuario`, `cargo_usuario`, `especialidad_usuario`, `contrasena`) VALUES
('1152205420', 'juan felipe', 'colon', 'forero', 'Odontólogo', 'Endodoncia.', '123'),
('1152205422', 'prueba auxiliar', 'prueba', 'prueba', 'Auxiliar', 'Seleccione una especialidad.', '123'),
('1152216574', 'fabian', 'lopera', 'alvarez', 'Odontólogo', 'Ortodoncia.', '1020'),
('1213', 'juan ', 'lopez', 'chaverra', 'Administrador', 'Seleccione una especialidad.', '011');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
 ADD PRIMARY KEY (`id_cita`), ADD KEY `citas_usuarios_FK` (`id_usuario_citas`);

--
-- Indices de la tabla `citas_radiografias`
--
ALTER TABLE `citas_radiografias`
 ADD PRIMARY KEY (`id_cita_cr`,`id_radiografia_cr`), ADD KEY `citas_rad_rad_FK` (`id_radiografia_cr`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
 ADD PRIMARY KEY (`id_estado`);

--
-- Indices de la tabla `estado_civil`
--
ALTER TABLE `estado_civil`
 ADD PRIMARY KEY (`id_estado_civil`);

--
-- Indices de la tabla `genero`
--
ALTER TABLE `genero`
 ADD PRIMARY KEY (`id_genero`);

--
-- Indices de la tabla `materiales_consultorio`
--
ALTER TABLE `materiales_consultorio`
 ADD PRIMARY KEY (`id_matcon`), ADD KEY `matcons_usuarios_FK` (`id_usuario_matcon`);

--
-- Indices de la tabla `medidas_esq_tej_blandos_dent`
--
ALTER TABLE `medidas_esq_tej_blandos_dent`
 ADD PRIMARY KEY (`id_med_esq`);

--
-- Indices de la tabla `metbd_hc`
--
ALTER TABLE `metbd_hc`
 ADD PRIMARY KEY (`id_metbd`,`num_doc_metbd`), ADD KEY `metbd_hc_pacientes_FK` (`num_doc_metbd`);

--
-- Indices de la tabla `odontogramas`
--
ALTER TABLE `odontogramas`
 ADD PRIMARY KEY (`id_odontograma`);

--
-- Indices de la tabla `odontograma_cita`
--
ALTER TABLE `odontograma_cita`
 ADD PRIMARY KEY (`id_cita_oc`,`id_odontograma_oc`), ADD KEY `odont_cita_odont_FK` (`id_odontograma_oc`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
 ADD PRIMARY KEY (`numero_doc_paciente`), ADD KEY `pacientes_estado_civil_FK` (`estado_civil_paciente`), ADD KEY `pacientes_estados_FK` (`id_estado_paciente`), ADD KEY `pacientes_genero_FK` (`genero_paciente`), ADD KEY `pacientes_tipo_documento_FK` (`tipo_doc_paciente`), ADD KEY `pacientes_usuarios_FK` (`cedula_usuario_paciente`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
 ADD PRIMARY KEY (`id_proveedor`), ADD KEY `proveedores_usuarios_FK` (`id_usuario_proveedor`);

--
-- Indices de la tabla `proveedor_materiales`
--
ALTER TABLE `proveedor_materiales`
 ADD PRIMARY KEY (`id_proveedor_pm`,`id_mat_pm`), ADD KEY `proveedor_mat_matcons_FK` (`id_mat_pm`);

--
-- Indices de la tabla `radiografias`
--
ALTER TABLE `radiografias`
 ADD PRIMARY KEY (`id_radiografia`);

--
-- Indices de la tabla `seguimiento_hc`
--
ALTER TABLE `seguimiento_hc`
 ADD PRIMARY KEY (`id_seg_hc`,`num_doc_seg`), ADD KEY `seg_hc_pac_FK` (`num_doc_seg`);

--
-- Indices de la tabla `tipo_documento`
--
ALTER TABLE `tipo_documento`
 ADD PRIMARY KEY (`id_tipo_doc`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`cedula_usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
ADD CONSTRAINT `citas_usuarios_FK` FOREIGN KEY (`id_usuario_citas`) REFERENCES `usuarios` (`cedula_usuario`);

--
-- Filtros para la tabla `citas_radiografias`
--
ALTER TABLE `citas_radiografias`
ADD CONSTRAINT `citas_rad_citas_FK` FOREIGN KEY (`id_cita_cr`) REFERENCES `citas` (`id_cita`),
ADD CONSTRAINT `citas_rad_rad_FK` FOREIGN KEY (`id_radiografia_cr`) REFERENCES `radiografias` (`id_radiografia`);

--
-- Filtros para la tabla `materiales_consultorio`
--
ALTER TABLE `materiales_consultorio`
ADD CONSTRAINT `matcons_usuarios_FK` FOREIGN KEY (`id_usuario_matcon`) REFERENCES `usuarios` (`cedula_usuario`);

--
-- Filtros para la tabla `metbd_hc`
--
ALTER TABLE `metbd_hc`
ADD CONSTRAINT `metbd_hc_metb_dent_FK` FOREIGN KEY (`id_metbd`) REFERENCES `medidas_esq_tej_blandos_dent` (`id_med_esq`),
ADD CONSTRAINT `metbd_hc_pacientes_FK` FOREIGN KEY (`num_doc_metbd`) REFERENCES `pacientes` (`numero_doc_paciente`);

--
-- Filtros para la tabla `odontograma_cita`
--
ALTER TABLE `odontograma_cita`
ADD CONSTRAINT `odont_cita_citas_FK` FOREIGN KEY (`id_cita_oc`) REFERENCES `citas` (`id_cita`),
ADD CONSTRAINT `odont_cita_odont_FK` FOREIGN KEY (`id_odontograma_oc`) REFERENCES `odontogramas` (`id_odontograma`);

--
-- Filtros para la tabla `pacientes`
--
ALTER TABLE `pacientes`
ADD CONSTRAINT `pacientes_estado_civil_FK` FOREIGN KEY (`estado_civil_paciente`) REFERENCES `estado_civil` (`id_estado_civil`),
ADD CONSTRAINT `pacientes_estados_FK` FOREIGN KEY (`id_estado_paciente`) REFERENCES `estados` (`id_estado`),
ADD CONSTRAINT `pacientes_genero_FK` FOREIGN KEY (`genero_paciente`) REFERENCES `genero` (`id_genero`),
ADD CONSTRAINT `pacientes_tipo_documento_FK` FOREIGN KEY (`tipo_doc_paciente`) REFERENCES `tipo_documento` (`id_tipo_doc`),
ADD CONSTRAINT `pacientes_usuarios_FK` FOREIGN KEY (`cedula_usuario_paciente`) REFERENCES `usuarios` (`cedula_usuario`);

--
-- Filtros para la tabla `proveedores`
--
ALTER TABLE `proveedores`
ADD CONSTRAINT `proveedores_usuarios_FK` FOREIGN KEY (`id_usuario_proveedor`) REFERENCES `usuarios` (`cedula_usuario`);

--
-- Filtros para la tabla `proveedor_materiales`
--
ALTER TABLE `proveedor_materiales`
ADD CONSTRAINT `proveedor_mat_matcons_FK` FOREIGN KEY (`id_mat_pm`) REFERENCES `materiales_consultorio` (`id_matcon`),
ADD CONSTRAINT `proveedor_mat_pro_FK` FOREIGN KEY (`id_proveedor_pm`) REFERENCES `proveedores` (`id_proveedor`);

--
-- Filtros para la tabla `seguimiento_hc`
--
ALTER TABLE `seguimiento_hc`
ADD CONSTRAINT `seg_hc_pac_FK` FOREIGN KEY (`num_doc_seg`) REFERENCES `pacientes` (`numero_doc_paciente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
