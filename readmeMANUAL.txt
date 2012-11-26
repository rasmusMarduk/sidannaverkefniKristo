Stj�rnunarhandb�k

Til �ess a� keyra leikinn �arf vi�skiptavinurinn a� hafa eftirfarandi hluti uppsetta:
	- JDK 1.7+

Til a� ���a leikinn �arf vi�skiptavinurinn a� hafa eftirfarandi hluti uppsetta:
	- Apache ant
	- JDK 1.7+
		
Til �ess a� geta keyrt leikinn fr� jar skr�nni �arf vi�skiptavinurinn einungis a� hafa Java runtime enviroment uppsett.
�etta er skipanahamsleikur og �v� �arf a� keyra hann � skipanaham.
	
	1. Af�jappa sidannaverkefniKristo.tar.gz (e�a .zip)
	2. Opna m�ppuna sidannaverkefniKristo
		a. Opna m�ppuna Versions
		b. Opna n�justu �tg�fu af TicTacToe
	3. Keyra JAR skr�na me� eftirfarandi skipun
		java -jar lalli.jar
	4. Nj�ta �ess a� spila Myllu!

Eftirfarandi skref �arf a� fara � gegnum til a� keyra einingaprufanir og/e�a b�a til n�ja JAR skr�. Reikna�
er me� a� notandi hafi forritin sem eru nefnd h�r efst og a� notandi vinni � skipanaham.
	
	1. Ni�urhala zip e�a tar skr� fr� https://github.com/rasmusMarduk/sidannaverkefniKristo/downloads
	2. Af�jappa skr�nni � sta� a� eigin vali, �r �v� kemur mappa sem heitir sidannaverkefniKristo.
	3. Opna skal m�ppuna sidannaverkefniKristo
	4. H�r er h�gt a� keyra eftirfarandi skipanir
		a. Keyra �arf eftirfarandi skipun til a� keyra einungis prufanir:
			ant unit-test
		b. Keyra �arf eftirfarandi skipun til a� keyra leikinn
			ant run
		c. Til �ess a� ���a og gera pr�fanir er h�gt a� skrifa einfaldlega
			ant
		
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
