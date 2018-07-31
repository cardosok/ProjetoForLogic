-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 31-Jul-2018 às 21:31
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `desafio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `avaliacao`
--

CREATE TABLE `avaliacao` (
  `id` int(11) NOT NULL,
  `mes_ano_ref` varchar(100) COLLATE utf8_bin NOT NULL,
  `cliente_participaram` varchar(40) COLLATE utf8_bin NOT NULL,
  `data_ultima_ava` varchar(10) COLLATE utf8_bin NOT NULL,
  `nota` int(11) DEFAULT NULL,
  `motivo` varchar(1000) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `avaliacao`
--

INSERT INTO `avaliacao` (`id`, `mes_ano_ref`, `cliente_participaram`, `data_ultima_ava`, `nota`, `motivo`) VALUES
(1, '07/2018', 'Cesar,Vitor', '00/00/0000', NULL, NULL),
(2, '08/2018', 'Cesar,Vitor', '00/00/0000', NULL, NULL),
(3, '08/2018', 'Cesar,Vitor', '00/00/0000', NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nome_cliente` varchar(100) COLLATE utf8_bin NOT NULL,
  `nome_contato` varchar(100) COLLATE utf8_bin NOT NULL,
  `data_cliente` varchar(10) COLLATE utf8_bin NOT NULL,
  `sinalizador` varchar(15) COLLATE utf8_bin NOT NULL,
  `ultima_ava` varchar(10) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome_cliente`, `nome_contato`, `data_cliente`, `sinalizador`, `ultima_ava`) VALUES
(1, 'tersted', 'teste', '26/07/2018', 'Nenhum', '00/00/0000'),
(2, 'teste 2a', 'sd', '16/08/2018', 'Nenhum', '00/00/0000'),
(3, 'teste 2as', 'sd', '06/09/2018', 'Nenhum', '00/00/0000'),
(4, 'teste 2asd', 'sd', '18/10/2018', 'Nenhum', '00/00/0000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `avaliacao`
--
ALTER TABLE `avaliacao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `avaliacao`
--
ALTER TABLE `avaliacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
