-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15-Abr-2015 às 20:16
-- Versão do servidor: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gospad_bd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abre_cx`
--

CREATE TABLE IF NOT EXISTS `abre_cx` (
`id` int(11) NOT NULL,
  `id_colaborador` int(11) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `entrada` double(14,2) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `a_pagar`
--

CREATE TABLE IF NOT EXISTS `a_pagar` (
`id` int(11) NOT NULL,
  `documento` varchar(50) NOT NULL,
  `vl_total` double(14,2) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `pgto_dt` date DEFAULT NULL,
  `vencimento_dt` date DEFAULT NULL,
  `lancamento_dt` date DEFAULT NULL,
  `vl_pago` double(14,2) DEFAULT NULL,
  `vl_apagar` double(14,2) DEFAULT NULL,
  `situacao` varchar(30) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `a_receber`
--

CREATE TABLE IF NOT EXISTS `a_receber` (
`id` int(11) NOT NULL,
  `documento` varchar(50) NOT NULL,
  `vl_total` double(14,2) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `recebimento_dt` date DEFAULT NULL,
  `vencimento_dt` date DEFAULT NULL,
  `lancamento_dt` date DEFAULT NULL,
  `vl_recebido` double(14,2) DEFAULT NULL,
  `vl_areceber` double(14,2) DEFAULT NULL,
  `situacao` varchar(30) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `balanco`
--

CREATE TABLE IF NOT EXISTS `balanco` (
`id` int(11) NOT NULL,
  `saldo_diario_i` double(14,2) DEFAULT NULL,
  `saldo_diario_f` double(14,2) DEFAULT NULL,
  `dt_diario` date DEFAULT NULL,
  `saldo_semana_i` double(14,2) DEFAULT NULL,
  `saldo_semana_f` double(14,2) DEFAULT NULL,
  `dt_semana` date DEFAULT NULL,
  `saldo_mes_i` double(14,2) DEFAULT NULL,
  `saldo_mes_f` double(14,2) DEFAULT NULL,
  `dt_mes` date DEFAULT NULL,
  `total_gastos` double(14,2) DEFAULT NULL,
  `total_ganhos` double(14,2) DEFAULT NULL,
  `saldo_final` double(14,2) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
`id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `uf` varchar(3) NOT NULL,
  `cnpj` varchar(20) DEFAULT NULL,
  `registro_dt` date DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `nascimento_dt` date DEFAULT NULL,
  `tel_comercial` varchar(20) DEFAULT NULL,
  `tel_residencial` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `endereco`, `cep`, `cidade`, `uf`, `cnpj`, `registro_dt`, `cpf`, `nascimento_dt`, `tel_comercial`, `tel_residencial`, `celular`, `fax`, `email`, `observacao`) VALUES
(1, 'abc', 'abc', '18291-829', 'abc', 'AC ', '12.345.678/9012-34', NULL, '   .   .   -  ', NULL, '(  )    -   ', '(  )    -   ', '(  )      -    ', '', '', ''),
(2, 'hsuahsuhau', 'hsuahsuahs', '21902-910', 'hsuahs', 'AC ', '  .   .   /    -  ', NULL, '   .   .   -  ', NULL, '(  )    -   ', '(  )    -   ', '(  )      -    ', '', '', ''),
(3, 'Rafael', 'shauush', '09190-221', 'ushahusa', 'RJ ', '92.020.911/0920-92', '2010-05-10', '219.020.909-21', '1989-08-05', '(  )    -   ', '(  )    -   ', '(  )      -    ', '', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradores`
--

CREATE TABLE IF NOT EXISTS `colaboradores` (
`id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `sexo` varchar(3) NOT NULL,
  `cpf` varchar(15) NOT NULL,
  `rg` varchar(15) NOT NULL,
  `ctps` varchar(50) NOT NULL,
  `cnh` varchar(50) DEFAULT NULL,
  `validade_cnh` date DEFAULT NULL,
  `tipo_cnh` varchar(10) DEFAULT NULL,
  `tipo_sangue` varchar(20) DEFAULT NULL,
  `telefone` varchar(20) NOT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `outro` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `endereco` varchar(100) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `cidade` varchar(80) NOT NULL,
  `uf` varchar(5) NOT NULL,
  `setor` varchar(80) NOT NULL,
  `cargo` varchar(80) NOT NULL,
  `funcao` varchar(80) NOT NULL,
  `usuario_sistema` varchar(4) DEFAULT NULL,
  `perfil` varchar(20) DEFAULT NULL,
  `login` varchar(30) DEFAULT NULL,
  `conf_login` varchar(30) DEFAULT NULL,
  `senha` varchar(16) DEFAULT NULL,
  `conf_senha` varchar(16) DEFAULT NULL,
  `email_senha` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE IF NOT EXISTS `contato` (
`id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `tel_1` varchar(15) NOT NULL,
  `tel_2` varchar(15) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `cel_1` varchar(15) NOT NULL,
  `cel_2` varchar(15) DEFAULT NULL,
  `outro` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fechar_cx`
--

CREATE TABLE IF NOT EXISTS `fechar_cx` (
`id` int(11) NOT NULL,
  `id_colaborador` int(11) NOT NULL,
  `dt_abre` date NOT NULL,
  `hr_abre` time NOT NULL,
  `dt_fecha` date NOT NULL,
  `hr_fecha` time NOT NULL,
  `saldo_i` double(14,2) DEFAULT NULL,
  `saldo_f` double(14,2) DEFAULT NULL,
  `total_venda` int(9) DEFAULT NULL,
  `total_compra` int(9) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
`id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(40) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `uf` varchar(3) NOT NULL,
  `cnpj` varchar(15) DEFAULT NULL,
  `registro_dt` date DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `nascimento_dt` date DEFAULT NULL,
  `tel_comercial` varchar(12) DEFAULT NULL,
  `tel_residencial` varchar(12) DEFAULT NULL,
  `celular` varchar(15) NOT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

CREATE TABLE IF NOT EXISTS `historico` (
`id` int(11) NOT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `data` varchar(12) DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
`id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `compra` double(14,2) NOT NULL,
  `venda` double(14,2) NOT NULL,
  `quantidade` double(14,2) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `fornecedor` varchar(50) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `comprador` varchar(50) NOT NULL,
  `id_comprador` int(11) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_e_servicos`
--

CREATE TABLE IF NOT EXISTS `vendas_e_servicos` (
`id` int(11) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `produto` varchar(50) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `local` varchar(50) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `vendedor` varchar(50) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abre_cx`
--
ALTER TABLE `abre_cx`
 ADD PRIMARY KEY (`id`), ADD KEY `id_colaborador` (`id_colaborador`);

--
-- Indexes for table `a_pagar`
--
ALTER TABLE `a_pagar`
 ADD PRIMARY KEY (`id`), ADD KEY `id_fornecedor` (`id_fornecedor`);

--
-- Indexes for table `a_receber`
--
ALTER TABLE `a_receber`
 ADD PRIMARY KEY (`id`), ADD KEY `id_cliente` (`id_cliente`);

--
-- Indexes for table `balanco`
--
ALTER TABLE `balanco`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientes`
--
ALTER TABLE `clientes`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `colaboradores`
--
ALTER TABLE `colaboradores`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `contato`
--
ALTER TABLE `contato`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fechar_cx`
--
ALTER TABLE `fechar_cx`
 ADD PRIMARY KEY (`id`), ADD KEY `id_colaborador` (`id_colaborador`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `historico`
--
ALTER TABLE `historico`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
 ADD PRIMARY KEY (`id`), ADD KEY `id_fornecedor` (`id_fornecedor`), ADD KEY `id_comprador` (`id_comprador`);

--
-- Indexes for table `vendas_e_servicos`
--
ALTER TABLE `vendas_e_servicos`
 ADD PRIMARY KEY (`id`), ADD KEY `id_produto` (`id_produto`), ADD KEY `id_vendedor` (`id_vendedor`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abre_cx`
--
ALTER TABLE `abre_cx`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `a_pagar`
--
ALTER TABLE `a_pagar`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `a_receber`
--
ALTER TABLE `a_receber`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `balanco`
--
ALTER TABLE `balanco`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `clientes`
--
ALTER TABLE `clientes`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `colaboradores`
--
ALTER TABLE `colaboradores`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `contato`
--
ALTER TABLE `contato`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fechar_cx`
--
ALTER TABLE `fechar_cx`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `historico`
--
ALTER TABLE `historico`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `vendas_e_servicos`
--
ALTER TABLE `vendas_e_servicos`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `abre_cx`
--
ALTER TABLE `abre_cx`
ADD CONSTRAINT `abre_cx_ibfk_1` FOREIGN KEY (`id_colaborador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `a_pagar`
--
ALTER TABLE `a_pagar`
ADD CONSTRAINT `a_pagar_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `a_receber`
--
ALTER TABLE `a_receber`
ADD CONSTRAINT `a_receber_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `fechar_cx`
--
ALTER TABLE `fechar_cx`
ADD CONSTRAINT `fechar_cx_ibfk_1` FOREIGN KEY (`id_colaborador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `produtos`
--
ALTER TABLE `produtos`
ADD CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`id_comprador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `produtos_ibfk_2` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `vendas_e_servicos`
--
ALTER TABLE `vendas_e_servicos`
ADD CONSTRAINT `vendas_e_servicos_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produtos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `vendas_e_servicos_ibfk_2` FOREIGN KEY (`id_vendedor`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
