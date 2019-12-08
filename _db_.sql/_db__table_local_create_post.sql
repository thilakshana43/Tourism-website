
-- --------------------------------------------------------

--
-- Table structure for table `local_create_post`
--

CREATE TABLE `local_create_post` (
  `Title` varchar(500) NOT NULL,
  `Name` varchar(250) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `Image` blob NOT NULL,
  `Price` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `local_create_post`
--

INSERT INTO `local_create_post` (`Title`, `Name`, `Description`, `Image`, `Price`) VALUES
('wefcv', 'scsdc', 'dacvsda', 0x322e6a7067, 13123);
