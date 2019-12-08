
-- --------------------------------------------------------

--
-- Table structure for table `tourist_signup`
--

CREATE TABLE `tourist_signup` (
  `User_Name` varchar(250) NOT NULL,
  `Password` varchar(250) NOT NULL,
  `Name` varchar(250) NOT NULL,
  `Tel_No` varchar(250) NOT NULL,
  `Email` varchar(250) NOT NULL,
  `Country` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tourist_signup`
--

INSERT INTO `tourist_signup` (`User_Name`, `Password`, `Name`, `Tel_No`, `Email`, `Country`) VALUES
('', '', '', '', '', ''),
('dca', 'poo123', 'dcdcdc', '23456', 'sasas@gamil.com', 'dcd'),
('Poo', 'poo123', 'Poornima', '0773479476', 'purmima98@gmail.com', 'Srilanka');
