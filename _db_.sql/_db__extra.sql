
--
-- Indexes for dumped tables
--

--
-- Indexes for table `local_create_post`
--
ALTER TABLE `local_create_post`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `local_login`
--
ALTER TABLE `local_login`
  ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `local_request`
--
ALTER TABLE `local_request`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tourist_signup`
--
ALTER TABLE `tourist_signup`
  ADD PRIMARY KEY (`User_Name`,`Password`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `local_request`
--
ALTER TABLE `local_request`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
