-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 06 oct. 2020 à 02:16
-- Version du serveur :  10.4.13-MariaDB
-- Version de PHP : 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `spring_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbre`
--

CREATE TABLE `arbre` (
  `id_arbre` bigint(20) NOT NULL,
  `date_creation` datetime DEFAULT NULL,
  `nom_arbre` varchar(255) DEFAULT NULL,
  `prix_arbre` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `arbre`
--

INSERT INTO `arbre` (`id_arbre`, `date_creation`, `nom_arbre`, `prix_arbre`) VALUES
(2, '2020-10-05 23:00:00', 'olivier', 1200),
(4, '2020-09-29 23:00:00', 'citronier', 1500),
(5, '2020-10-31 23:00:00', 'orange', 1500),
(6, '2017-01-30 23:00:00', 'pommier', 2400),
(7, '2019-11-29 23:00:00', 'olivier', 1500);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD PRIMARY KEY (`id_arbre`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `arbre`
--
ALTER TABLE `arbre`
  MODIFY `id_arbre` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
