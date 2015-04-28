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
-- Banco de Dados: `gospad_bd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `abre_cx`
--
-- em uso(#1033 - Incorrect information in file: '.\gospad_bd\abre_cx.frm')
-- Error reading data: (#1033 - Incorrect information in file: '.\gospad_bd\abre_cx.frm')

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
  `cnpj` varchar(20) DEFAULT NULL,
  `registro_dt` date DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `nascimento_dt` date DEFAULT NULL,
  `tel_comercial` varchar(20) DEFAULT NULL,
  `tel_residencial` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `endereco`, `cep`, `cidade`, `uf`, `cnpj`, `registro_dt`, `cpf`, `nascimento_dt`, `tel_comercial`, `tel_residencial`, `celular`, `fax`, `email`, `observacao`) VALUES
(2, 'Rafael Serdeiro Paes Leme', 'Rua Doutor Vasconcelos, 26, centro', '25804-240', 'Três Rios', 'RJ ', '  .   .   /    -  ', '0002-11-30', '132.851.197-99', '1989-08-05', '(  )    -    ', '(  )    -    ', '(24)9 8855-4671', '', 'rafaelspaesleme.ads@gmail.com', 'A construir CNPJ');

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
-- Estrutura da tabela `comprador`
--

CREATE TABLE IF NOT EXISTS `comprador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `id_comprador` int(11) NOT NULL,
  `obs` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `comprador`
--

INSERT INTO `comprador` (`id`, `nome`, `id_comprador`, `obs`) VALUES
(1, 'Rafael S. Paes Leme', 10, 'teste');

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
-- em uso(#1033 - Incorrect information in file: '.\gospad_bd\fechar_cx.frm')
-- Error reading data: (#1033 - Incorrect information in file: '.\gospad_bd\fechar_cx.frm')

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
  `cnpj` varchar(20) DEFAULT NULL,
  `registro_dt` date DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `nascimento_dt` date DEFAULT NULL,
  `tel_comercial` varchar(20) DEFAULT NULL,
  `tel_residencial` varchar(20) DEFAULT NULL,
  `celular` varchar(20) NOT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `observacao` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id`, `nome`, `endereco`, `cep`, `cidade`, `uf`, `cnpj`, `registro_dt`, `cpf`, `nascimento_dt`, `tel_comercial`, `tel_residencial`, `celular`, `fax`, `email`, `observacao`) VALUES
(1, 'Goel Tecnologia', 'Rua Dr. Vasconcelos', '25804-240', 'Três Rios', 'RJ ', '  .   .   /    -  ', '0002-11-30', '132.851.197-99', '1989-08-05', '(  )    -    ', '(  )    -    ', '(24)9 9999-7634', '', 'rafaels.paesleme@hotmail.com', 'teste'),
(2, 'Nike', 'Rua Nike', '10210-210', 'New York', 'RJ ', '12.121.212/1212-12', '1900-01-01', '   .   .   -  ', '0002-11-30', '(  )    -    ', '(  )    -    ', '(  )      -    ', '', '', '');

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
  KEY `id_fornecedor` (`id_fornecedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_e_servicos`
--
-- em uso(#1033 - Incorrect information in file: '.\gospad_bd\vendas_e_servicos.frm')
-- Error reading data: (#1033 - Incorrect information in file: '.\gospad_bd\vendas_e_servicos.frm')

--
-- Restrições para as tabelas dumpadas
--

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
-- Restrições para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `produtos_ibfk_2` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
