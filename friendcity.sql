-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 31-08-2022 a las 13:08:35
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `friendcity`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `event`
--

CREATE TABLE `event` (
  `id` bigint(20) NOT NULL,
  `budget` float NOT NULL,
  `description` varchar(500) DEFAULT NULL,
  `event_date` date DEFAULT NULL,
  `hour` time DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `owner_id,
        nulleable=false` bigint(20) DEFAULT NULL,
  `owner_id, nulleable=false` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `event`
--

INSERT INTO `event` (`id`, `budget`, `description`, `event_date`, `hour`, `image`, `location`, `name`, `owner_id,
        nulleable=false`, `owner_id, nulleable=false`) VALUES
(1, 5, 'Traed pipas y palomitas y algún DVD. Lorem fistrum de la pradera está la cosa muy malar a gramenawer mamaar te va a hasé pupitaa mamaar diodenoo ese pedazo de qué dise usteer. Qué dise usteer mamaar de la pradera te va a hasé pupitaa. Torpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese peda', '2022-09-02', '21:00:00', 'https://www.giztele.com/wp-content/uploads/2020/06/ver-estrenos-en-casa-1.jpg', 'Coruña', 'Película en casa', NULL, 1),
(2, 5, 'Jugaremos a juegos de rol frikis. Ese pedazo de a wan jarl diodenoo te voy a borrar el cerito te va a hase pupitaa se calle uste. Pecador jarl la caidita condemor diodenoo. \nTorpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese pedazo de me cago en tus muelas no puedor ese pedazo de mamaar fi', '2022-09-04', '21:00:00', 'https://us.123rf.com/450wm/luckybusiness/luckybusiness1803/luckybusiness180300046/104216894-feliz-linda-chica-gan%C3%B3-en-el-juego-de-cartas.jpg?ver=6', 'Coruña ', 'Noche de juegos', NULL, 1),
(3, 100, 'Vacaciones de Verano, Don Simón, \nvacaciones en la playa de la Malagueta. \nAl ataquerl a peich benemeritaar pupita jarl ese hombree tiene musho peligro al ataquerl está la cosa muy malar ahorarr condemor.\nLorem fistrum laboris se calle ustée ut ese que llega ullamco diodenoo minim no te digo trigo por no llamarte Rodrigor benemeritaar officia. A gramenawer dolore minim papaar papaar aliquip occaecat qué dise usteer voluptate mamaar minim. Qui hasta luego Lucas no puedor caballo blanco caballo', '2022-08-10', '10:00:00', 'https://th.bing.com/th/id/OIP.ueFta_nVRefwcbGDf87a2AHaEK?pid=ImgDet&rs=1', 'Málaga', 'Vacaciones en Málaga', NULL, 2),
(4, 20, 'Conciertazo del Evaristo. Por la gloria de mi madre ese hombree al ataquerl condemor a gramenawer condemor al ataquerl te voy a borrar el cerito. \nCaballo blanco caballo negroorl benemeritaar al ataquerl no te digo trigo por no llamarte Rodrigor no puedor. Va usté muy cargadoo al ataquerl pecador está la cosa muy malar te va a hasé pupitaa apetecan al ataquerl ese hombree. Pupita papaar papaar de la pradera fistro tiene musho peligro ese que llega por la gloria de mi madre. Va usté muy cargadoo ', '2022-09-10', '20:00:00', 'https://th.bing.com/th/id/OIP.zE-kNqn36TtePMyms_1RswHaE7?pid=ImgDet&rs=1', 'Madriz', 'Concierto', NULL, 2),
(5, 35, 'Mariscada galega y Cerveza Estrella Galizia. \nPecador diodenoo condemor hasta luego Lucas ahorarr pupita no te digo trigo por no llamarte Rodrigor. Diodenoo fistro de la pradera ese hombree me cago en tus muelas papaar papaar a peich caballo blanco caballo\nTorpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se', '2022-08-14', '15:00:00', 'https://images.unsplash.com/photo-1606850780554-b55ea4dd0b70?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80', 'Restaurante Galego', 'Mariscada con amigos', NULL, 2),
(6, 5, 'Visionado de película Acción Mutante, traed bebidas y snacks. Fistro quietooor papaar papaar ese hombree ese pedazo de diodenoo a peich. Fistro se calle uste diodeno de la pradera por la gloria de mi madre ese que llega.\nTorpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese pedazo de me cago ', '2022-09-17', '21:00:00', 'https://i.ytimg.com/vi/U1xOnvq1iVU/sddefault.jpg', 'Málaga', 'Acción Mutante', NULL, 2),
(7, 5, 'Lorem fistrum minim labore mamaar. Eiusmod pupita diodeno adipisicing fistro hasta luego Lucas. Duis nostrud quietooor la caidita va usté muy cargadoo magna diodeno está la cosa muy malar. \nTorpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese pedazo de me cago en tus muelas no puedor ese ped', '2022-09-03', '20:00:00', 'https://images.unsplash.com/photo-1530103862676-de8c9debad1d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80', 'Toledo, Spain', 'Fiesta con globos', NULL, 2),
(8, 5, 'Paseo por el bosque para buscar setas. Va usté muy cargadoo torpedo ahorarr elit elit no te digo trigo por no llamarte Rodrigor et amatomaa velit. Ese pedazo de amatomaa por la gloria de mi madre fistro ad me cago en tus muelas Torpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese pedazo de m', '2022-09-04', '10:00:00', 'https://images.unsplash.com/photo-1505820013142-f86a3439c5b2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1171&q=80', '28410 Manzanares el Real, Madrid, Spain', 'Paseo por el bosque ', NULL, 1),
(9, 20, 'Clases de cocina, aprenderemos a hacer sushi.  Torpedo diodenoo benemeritaar me cago en tus muelas va ustÃ© muy cargadoo no te digo trigo por no llamarte Rodrigor caballo blanco caballo negroorl de la pradera\nTorpedo va usté muy cargadoo fistro fistro tiene musho peligro tiene musho peligro. Ese que llega apetecan va usté muy cargadoo apetecan diodeno sexuarl. Diodenoo condemor la caidita condemor me cago en tus muelas jarl de la pradera sexuarl se calle ustée. Ese pedazo de me cago en tus muela', '2022-08-14', '14:00:00', 'https://images.unsplash.com/photo-1579871494447-9811cf80d66c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80', 'Spain', 'Clases de cocina', NULL, 2),
(10, 5, 'Lorem fistrum llevame al sircoo diodenoo adipisicing cillum te voy a borrar el cerito qui estÃ¡ la cosa muy malar eiusmod. A wan ahorarr cillum ut velit tempor papaar papaar. Apetecan aliqua dolor esse.\nNo puedor llevame al sircoo ahorarr diodenoo benemeritaar a gramenawer te voy a borrar el cerito tiene musho peligro amatomaa pecador. A gramenawer a wan papaar papaar ahorarr está la cosa muy malar diodeno ese que llega caballo blanco caballo negroorl. \nTorpedo va usté muy cargadoo fistro fistro', '2022-08-13', '10:00:00', 'https://images.unsplash.com/photo-1528732262645-b06fa3a79c9e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80', 'Madrid, Spain', 'En el río con amigos', NULL, 2),
(11, 100, 'Va usté muy cargadoo torpedo ahorarr elit elit no te digo trigo por no llamarte Rodrigor et amatomaa velit. Ese pedazo de amatomaa por la gloria de mi madre fistro\nCommodo tiene musho peligro se calle ustée magna. Te voy a borrar el cerito a peich a peich occaecat la caidita al ataquerl no te digo trigo por no llamarte Rodrigor aute ese hombree te va a hasé pupitaa. Officia elit aliqua commodo officia. Labore hasta luego Lucas ese pedazo de veniam tempor hasta luego Lucas voluptate laboris sed. ', '2022-08-04', '10:00:00', 'https://images.unsplash.com/photo-1533535280643-f9af97f7d6dc?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80', 'Coruña', 'Vacaciones en Coruña', NULL, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `event_members`
--

CREATE TABLE `event_members` (
  `user_id` bigint(20) NOT NULL,
  `event_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `email`, `name`, `password`, `username`) VALUES
(1, 'Otro@email.com', 'Otro', '$2a$10$2DWZFaECNk.iU.9aYT3nzu90auqAGJ8oByBI1nh111dAFfNn63Xda', 'Otro'),
(2, 'Bea@gmail.com', 'Bea', '$2a$10$1UyuPrq7thZ/Lggcad8zcu0cU1A6AliTrGaHwQNKiy5.EkTUMjVIu', 'Bea'),
(3, 'Miguel@gmail.com', 'Miguel', '$2a$10$VreFToUkNIANBTcC4Z9XK.IvVdXPZYBRoMe8hB6mKstrrSx.AXe/e', 'Miguel'),
(4, 'bea.gmail.com', 'beitxuela', '$2a$10$oCXgDVMz7noDBO5S9e1tIuf2X51f.BZfAoviBIezmL4L5gK7QOnzW', 'beitxuela2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_roles`
--

CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user_roles`
--

INSERT INTO `user_roles` (`user_id`, `role_id`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKg4u9cveu2lty3xijwt0e21yoh` (`owner_id, nulleable=false`);

--
-- Indices de la tabla `event_members`
--
ALTER TABLE `event_members`
  ADD PRIMARY KEY (`user_id`,`event_id`),
  ADD KEY `FKdsnu3vai441uxx65jb04ayea3` (`event_id`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `user_roles`
--
ALTER TABLE `user_roles`
  ADD PRIMARY KEY (`user_id`,`role_id`),
  ADD KEY `FKej3jidxlte0r8flpavhiso3g6` (`role_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `event`
--
ALTER TABLE `event`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `event`
--
ALTER TABLE `event`
  ADD CONSTRAINT `FKg4u9cveu2lty3xijwt0e21yoh` FOREIGN KEY (`owner_id, nulleable=false`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `event_members`
--
ALTER TABLE `event_members`
  ADD CONSTRAINT `FKdsnu3vai441uxx65jb04ayea3` FOREIGN KEY (`event_id`) REFERENCES `event` (`id`),
  ADD CONSTRAINT `FKrg6wggelqk0u5ju3xdehd5sm8` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `user_roles`
--
ALTER TABLE `user_roles`
  ADD CONSTRAINT `FK40cm955hgg5oxf1oax8mqw0c4` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKej3jidxlte0r8flpavhiso3g6` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
