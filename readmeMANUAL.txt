Stjórnunarhandbók

Til þess að keyra leikinn þarf viðskiptavinurinn að hafa eftirfarandi hluti uppsetta:
	- JDK 1.7+

Til að þýða leikinn þarf viðskiptavinurinn að hafa eftirfarandi hluti uppsetta:
	- Apache ant
	- JDK 1.7+
		
Til þess að geta keyrt leikinn frá jar skránni þarf viðskiptavinurinn einungis að hafa Java runtime enviroment uppsett.
Þetta er skipanahamsleikur og því þarf að keyra hann í skipanaham.
	
	1. Afþjappa sidannaverkefniKristo.tar.gz (eða .zip)
	2. Opna möppuna sidannaverkefniKristo
		a. Opna möppuna Versions
		b. Opna nýjustu útgáfu af TicTacToe
	3. Keyra JAR skrána með eftirfarandi skipun
		java -jar lalli.jar
	4. Njóta þess að spila Myllu!

Eftirfarandi skref þarf að fara í gegnum til að keyra einingaprufanir og/eða búa til nýja JAR skrá. Reiknað
er með að notandi hafi forritin sem eru nefnd hér efst og að notandi vinni í skipanaham.
	
	1. Niðurhala zip eða tar skrá frá https://github.com/rasmusMarduk/sidannaverkefniKristo/downloads
	2. Afþjappa skránni á stað að eigin vali, úr því kemur mappa sem heitir sidannaverkefniKristo.
	3. Opna skal möppuna sidannaverkefniKristo
	4. Hér er hægt að keyra eftirfarandi skipanir
		a. Keyra þarf eftirfarandi skipun til að keyra einungis prufanir:
			ant unit-test
		b. Keyra þarf eftirfarandi skipun til að keyra leikinn
			ant run
		c. Til þess að þýða og gera prófanir er hægt að skrifa einfaldlega
			ant
		
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
