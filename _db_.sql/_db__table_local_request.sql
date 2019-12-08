
-- --------------------------------------------------------

--
-- Table structure for table `local_request`
--

CREATE TABLE `local_request` (
  `ID` int(11) NOT NULL,
  `Name` varchar(250) NOT NULL,
  `Tel_No` varchar(250) NOT NULL,
  `Status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `local_request`
--

INSERT INTO `local_request` (`ID`, `Name`, `Tel_No`, `Status`) VALUES
(1, 'Poornima', '0773479476', 'NO');
