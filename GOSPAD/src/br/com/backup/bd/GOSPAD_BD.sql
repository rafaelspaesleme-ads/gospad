-- phpMyAdmin SQL Dump
-- version 3.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.25a
-- Versão do PHP: 5.4.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `GOSPAD_BD`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abre_cx`
--

CREATE TABLE IF NOT EXISTS `abre_cx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_colaborador` int(11) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `entrada` double(14,2) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_colaborador` (`id_colaborador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `a_pagar`
--

CREATE TABLE IF NOT EXISTS `a_pagar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `documento` varchar(50) NOT NULL,
  `vl_total` double(14,2) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `pgto_dt` date DEFAULT NULL,
  `vencimento_dt` date DEFAULT NULL,
  `lancamento_dt` date DEFAULT NULL,
  `vl_pago` double(14,2) DEFAULT NULL,
  `vl_apagar` double(14,2) DEFAULT NULL,
  `situacao` varchar(30) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_fornecedor` (`id_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `a_receber`
--

CREATE TABLE IF NOT EXISTS `a_receber` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `documento` varchar(50) NOT NULL,
  `vl_total` double(14,2) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `recebimento_dt` date DEFAULT NULL,
  `vencimento_dt` date DEFAULT NULL,
  `lancamento_dt` date DEFAULT NULL,
  `vl_recebido` double(14,2) DEFAULT NULL,
  `vl_areceber` double(14,2) DEFAULT NULL,
  `situacao` varchar(30) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `balanco`
--

CREATE TABLE IF NOT EXISTS `balanco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaboradores`
--

CREATE TABLE IF NOT EXISTS `colaboradores` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `contato`
--

CREATE TABLE IF NOT EXISTS `contato` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `tel_1` varchar(15) NOT NULL,
  `tel_2` varchar(15) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `cel_1` varchar(15) NOT NULL,
  `cel_2` varchar(15) DEFAULT NULL,
  `outro` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fechar_cx`
--

CREATE TABLE IF NOT EXISTS `fechar_cx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_colaborador` int(11) NOT NULL,
  `dt_abre` date NOT NULL,
  `hr_abre` time NOT NULL,
  `dt_fecha` date NOT NULL,
  `hr_fecha` time NOT NULL,
  `saldo_i` double(14,2) DEFAULT NULL,
  `saldo_f` double(14,2) DEFAULT NULL,
  `total_venda` int(9) DEFAULT NULL,
  `total_compra` int(9) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_colaborador` (`id_colaborador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

CREATE TABLE IF NOT EXISTS `historico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) DEFAULT NULL,
  `data` varchar(12) DEFAULT NULL,
  `hora` varchar(10) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE IF NOT EXISTS `produtos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `compra` double(14,2) NOT NULL,
  `venda` double(14,2) NOT NULL,
  `quantidade` double(14,2) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `fornecedor` varchar(50) NOT NULL,
  `id_fornecedor` int(11) NOT NULL,
  `comprador` varchar(50) NOT NULL,
  `id_comprador` int(11) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_fornecedor` (`id_fornecedor`),
  KEY `id_comprador` (`id_comprador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_e_servicos`
--

CREATE TABLE IF NOT EXISTS `vendas_e_servicos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(10) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `produto` varchar(50) DEFAULT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `local` varchar(50) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  `vendedor` varchar(50) NOT NULL,
  `id_vendedor` int(11) NOT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_produto` (`id_produto`),
  KEY `id_vendedor` (`id_vendedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `abre_cx`
--
ALTER TABLE `abre_cx`
  ADD CONSTRAINT `abre_cx_ibfk_1` FOREIGN KEY (`id_colaborador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para a tabela `a_pagar`
--
ALTER TABLE `a_pagar`
  ADD CONSTRAINT `a_pagar_ibfk_1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para a tabela `a_receber`
--
ALTER TABLE `a_receber`
  ADD CONSTRAINT `a_receber_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para a tabela `fechar_cx`
--
ALTER TABLE `fechar_cx`
  ADD CONSTRAINT `fechar_cx_ibfk_1` FOREIGN KEY (`id_colaborador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `produtos_ibfk_2` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `produtos_ibfk_1` FOREIGN KEY (`id_comprador`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para a tabela `vendas_e_servicos`
--
ALTER TABLE `vendas_e_servicos`
  ADD CONSTRAINT `vendas_e_servicos_ibfk_2` FOREIGN KEY (`id_vendedor`) REFERENCES `colaboradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vendas_e_servicos_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produtos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
