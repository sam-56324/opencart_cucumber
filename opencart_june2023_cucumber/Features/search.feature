Feature:Search feature  

	@sanity
	Scenario:Successful search
	 Given Search input box is enabled
	 When enter the details in search input box
	 And user click on search button
	 Then details should appear on the screen 