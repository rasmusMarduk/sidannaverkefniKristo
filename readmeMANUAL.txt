
Stjórnunarhandbók

Til að þýða og keyra leikinn þarft viðskiptavinurinn að hafa eftirfarandi hluti uppsetta:
		- Apache ant
		- JDK 1.7+
		
Til þess að geta keyrt leikinn frá jar skránni þarf viðskiptavinurinn einungis að hafa Java runtime enviroment uppsett. 
Eftirfarandi skref þurfa því aðeins að vera keyrð einu sinni, eftir það mun viðskiptavinurinn hafa jar skránna sem er nauðsynleg til þess
að geta dreift leiknum.
		
		1. Niðurhala zip skrá frá https://github.com/rasmusMarduk/sidannaverkefniKristo  ///(setja inn retta slod)
		2. Draga úr skránni, helst í heima möppuna á tölvunni. Niðurstaðan er mappa sem heitir sidannaverkefniKristo 
		
		-- GNU / Linux:  ////// þurfum að skoða og breyta og laga
3. Make sure the runLinux.sh is executable (right click or run chmod -x runLinux.sh ).
4. Run the script by entering ./runLinux.sh in a terminal window from the Mylla directory. It will run tests, compile the game and create an executable .jar file. It will then ask if you would like to play the game.
5. The executable jar file containing the game will be located in the hidden folder: ~/.m2/repository/is/marshmallow/Mylla/1.3-SNAPSHOT and can be distributed and executed from anywhere by issuing the command java -jar Mylla-1.3-SNAPSHOT.jar
Alternative: Run the commands manually as listed below in the Windows section.

-------- Microsoft Windows:
	3. Viðskiptavinurinn þarf að keyra eftirfarandi skipanir í skelinni í TicTacToe möppunni:
			- ant run 
			
			
	4. Keyrslufæra jar skráin sem inniheldur leikinn verður staðsett í sömu möppu og mappan sidannaverkefniKristo
	
	
	
	Þróunarhandbók (development manual)
	
	Eftirfarandi hluti þarf að gera á "hreinni" vél til þess að geta builda og bætt við kóða á verkefninu.
	Setja upp GIT
	- www.github.com
	- búa til aðgang að git
	Windows:
	- Fara þarf á eftirfarandi slóð og fylgja leiðbeiningum https://help.github.com/articles/set-up-git
	
	GNU/LINUX:
	- Fara þarf á eftirfarandi slóð http://mac.github.com/
	- Næst þarf að opna skelina(terminal) og klóna verkefnið í möppu með því að nota eftirfarandi skipun
	 git clone
	- Ef aðila finnst að kóði þeirra eigi skilið að tilheyra "main source tree" verður forritarinn að senda pull
	skipun á github í gegnum þennan link https://help.github.com/articles/set-up-git
	- Ef teyminu á bakvið þennan snilldar leik líkar vel við framlagið frá forritaranum verður haldin fundur og rætt hvort viðkomandi aðili
	fái aðgang að "main repository"
	
	Windows 7:
	Installa Java development kit
	- Fara þarf á eftirfarandi slóð  http://www.oracle.com/technetwork/java/javase/downloads/index.html
	- Ná þarf í nýjasta jdk
	- Unzippa(ísl) þarf möppuna í aðra möppu að eigin vali
	- Fara þarf næst í Control Panel/System and Security/System/Advanced system settings
	- Veldu "Enviroment variables", búðu til nýja breytu sem heitir JAVA_HOME
	- Setja þarf næst slóðina á jdk möppunni í JAVA_HOME breytuna
	- finna þarf næst "path" breytuna og setja JAVA_HOME breytuna inn í path breytuna
	Installa þarf næst Ant
	- Farðu á eftirfarandi slóð http://ant.apache.org/bindownload.cgi
	- Ná þarf í nýjustu útgáfuna af ant
	- Unzip(ísl) þarf möppuna í aðra möppu að eigin vali
	- Fara þarf næst í Control Panel/System and Security/System/Advanced system setting
	- Velja þarf "Enviromental variables", búðu til nýja breytu sem heitir ANT_HOME
	- Setja þarf slóðina á ant möppuna inn í ANT_HOME breytuna
	- Finna þarf "path" breytuna og setja ANT_HOME breytuna inn í "path" breytuna
	
	GNU_LINUX:
	Install Java development kit
	- Fara þarf á eftirfarandi slóð  http://www.oracle.com/technetwork/java/javase/downloads/index.html
	- Ná þarf í nýjasta jdk pakkann fyrir mismunandi tegundir af Linux og Mac os stýrikerfum og installa því
	- Settu í .bashrc eða svipað, export JAVA_HOME="/usr/java/jdk1.7.0;
	- Í lokin þarf svo að Installa ant.
	
	
	
	


























