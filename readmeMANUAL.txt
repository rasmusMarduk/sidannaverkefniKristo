
Stj�rnunarhandb�k

Til a� ���a og keyra leikinn �arft vi�skiptavinurinn a� hafa eftirfarandi hluti uppsetta:
		- Apache ant
		- JDK 1.7+
		
Til �ess a� geta keyrt leikinn fr� jar skr�nni �arf vi�skiptavinurinn einungis a� hafa Java runtime enviroment uppsett. 
Eftirfarandi skref �urfa �v� a�eins a� vera keyr� einu sinni, eftir �a� mun vi�skiptavinurinn hafa jar skr�nna sem er nau�synleg til �ess
a� geta dreift leiknum.
		
		1. Ni�urhala zip skr� fr� https://github.com/rasmusMarduk/sidannaverkefniKristo  ///(setja inn retta slod)
		2. Draga �r skr�nni, helst � heima m�ppuna � t�lvunni. Ni�ursta�an er mappa sem heitir sidannaverkefniKristo 
		
		-- GNU / Linux:  ////// �urfum a� sko�a og breyta og laga
3. Make sure the runLinux.sh is executable (right click or run chmod -x runLinux.sh ).
4. Run the script by entering ./runLinux.sh in a terminal window from the Mylla directory. It will run tests, compile the game and create an executable .jar file. It will then ask if you would like to play the game.
5. The executable jar file containing the game will be located in the hidden folder: ~/.m2/repository/is/marshmallow/Mylla/1.3-SNAPSHOT and can be distributed and executed from anywhere by issuing the command java -jar Mylla-1.3-SNAPSHOT.jar
Alternative: Run the commands manually as listed below in the Windows section.

-------- Microsoft Windows:
	3. Vi�skiptavinurinn �arf a� keyra eftirfarandi skipanir � skelinni � TicTacToe m�ppunni:
			- ant run 
			
			
	4. Keyrsluf�ra jar skr�in sem inniheldur leikinn ver�ur sta�sett � s�mu m�ppu og mappan sidannaverkefniKristo
	
	
	
	�r�unarhandb�k (development manual)
	
	Eftirfarandi hluti �arf a� gera � "hreinni" v�l til �ess a� geta builda og b�tt vi� k��a � verkefninu.
	Setja upp GIT
	- www.github.com
	- b�a til a�gang a� git
	Windows:
	- Fara �arf � eftirfarandi sl�� og fylgja lei�beiningum https://help.github.com/articles/set-up-git
	
	GNU/LINUX:
	- Fara �arf � eftirfarandi sl�� http://mac.github.com/
	- N�st �arf a� opna skelina(terminal) og kl�na verkefni� � m�ppu me� �v� a� nota eftirfarandi skipun
	 git clone
	- Ef a�ila finnst a� k��i �eirra eigi skili� a� tilheyra "main source tree" ver�ur forritarinn a� senda pull
	skipun � github � gegnum �ennan link https://help.github.com/articles/set-up-git
	- Ef teyminu � bakvi� �ennan snilldar leik l�kar vel vi� framlagi� fr� forritaranum ver�ur haldin fundur og r�tt hvort vi�komandi a�ili
	f�i a�gang a� "main repository"
	
	Windows 7:
	Installa Java development kit
	- Fara �arf � eftirfarandi sl��  http://www.oracle.com/technetwork/java/javase/downloads/index.html
	- N� �arf � n�jasta jdk
	- Unzippa(�sl) �arf m�ppuna � a�ra m�ppu a� eigin vali
	- Fara �arf n�st � Control Panel/System and Security/System/Advanced system settings
	- Veldu "Enviroment variables", b��u til n�ja breytu sem heitir JAVA_HOME
	- Setja �arf n�st sl��ina � jdk m�ppunni � JAVA_HOME breytuna
	- finna �arf n�st "path" breytuna og setja JAVA_HOME breytuna inn � path breytuna
	Installa �arf n�st Ant
	- Far�u � eftirfarandi sl�� http://ant.apache.org/bindownload.cgi
	- N� �arf � n�justu �tg�funa af ant
	- Unzip(�sl) �arf m�ppuna � a�ra m�ppu a� eigin vali
	- Fara �arf n�st � Control Panel/System and Security/System/Advanced system setting
	- Velja �arf "Enviromental variables", b��u til n�ja breytu sem heitir ANT_HOME
	- Setja �arf sl��ina � ant m�ppuna inn � ANT_HOME breytuna
	- Finna �arf "path" breytuna og setja ANT_HOME breytuna inn � "path" breytuna
	
	GNU_LINUX:
	Install Java development kit
	- Fara �arf � eftirfarandi sl��  http://www.oracle.com/technetwork/java/javase/downloads/index.html
	- N� �arf � n�jasta jdk pakkann fyrir mismunandi tegundir af Linux og Mac os st�rikerfum og installa �v�
	- Settu � .bashrc e�a svipa�, export JAVA_HOME="/usr/java/jdk1.7.0;
	- � lokin �arf svo a� Installa ant.
	
	
	
	


























