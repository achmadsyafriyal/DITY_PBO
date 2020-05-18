-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2020 at 09:23 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_perpus`
--

CREATE TABLE `admin_perpus` (
  `id_admin` int(12) NOT NULL,
  `nama_admin` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_perpus`
--

INSERT INTO `admin_perpus` (`id_admin`, `nama_admin`, `alamat`, `no_tlp`) VALUES
(1, 'admin1', 'bandar lampung', '123');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_buku` int(20) NOT NULL,
  `judul_buku` varchar(35) NOT NULL,
  `kategori_buku` varchar(30) NOT NULL,
  `pengarang` varchar(20) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_buku`, `judul_buku`, `kategori_buku`, `pengarang`, `penerbit`, `tahun_terbit`) VALUES
(1, 'OOP', 'Programming', 'Pak Mugi', 'Informatika', '2020'),
(2, 'PAM', 'Programming', 'Pak Aidil', 'Informatika', '2020'),
(3, 'Socio Informatika', 'Teori', 'Pak Andika', 'Informatika', '2020'),
(4, 'PBO', 'Programming', 'Pak Luky', 'Informatika', '2020'),
(5, 'Pemrograman Java', 'Pemrograman', 'Dosen Informatika', 'Informatika', '2020'),
(6, 'Algoritma Struktur Data', 'Programming', 'Dosen Informatika', 'Informatika', '2020');

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `nip` int(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`nip`, `nama`, `alamat`, `no_tlp`) VALUES
(1, 'bukandosen', 'bukandosen', '000'),
(123, 'Pak Mugi', 'Lampung', '12324'),
(4567, 'Pak Rajif', 'Bandar Lampung', '987'),
(12345, 'Pak Luky', 'ITERA', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` int(20) NOT NULL,
  `nama_mhs` varchar(20) NOT NULL,
  `prodi` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `no_tlp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama_mhs`, `prodi`, `alamat`, `no_tlp`) VALUES
(1, 'bukanmhs', 'bukanmhs', 'bukanmhs', '000'),
(14117004, 'dian', 'if', 'bandar lampung', '1234567890'),
(14117051, 'iyal', 'informatika', 'kandis', '1234567'),
(14117138, 'Muttaqin', 'Informatika', 'Bandar Lampung', '123456'),
(14117145, 'telaga', 'informatika', 'jakarta', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_pinjam` int(20) NOT NULL,
  `nim` int(20) NOT NULL,
  `nip` int(20) NOT NULL,
  `id_buku` int(20) NOT NULL,
  `id_admin` int(12) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_kembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`id_pinjam`, `nim`, `nip`, `id_buku`, `id_admin`, `tgl_pinjam`, `tgl_kembali`) VALUES
(1, 14117145, 0, 1, 2, '2020-05-19', '2020-05-26'),
(2, 14117051, 0, 1, 1, '2020-05-19', '2020-05-26'),
(3, 14117004, 0, 3, 1, '2020-05-19', '2020-05-26');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_perpus`
--
ALTER TABLE `admin_perpus`
  ADD PRIMARY KEY (`id_admin`),
  ADD KEY `id_admin` (`id_admin`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_buku`),
  ADD KEY `id_buku` (`id_buku`);

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`nip`),
  ADD KEY `nip` (`nip`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `nim` (`nim`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_pinjam`),
  ADD KEY `nim` (`nim`),
  ADD KEY `nip` (`nip`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_admin` (`id_admin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
