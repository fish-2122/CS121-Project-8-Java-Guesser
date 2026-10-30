run: GuessingGame.class
	java GuessingGame.java

GuessingGame.class: GuessingGame.java
	javac GuessingGame.java

clean:
	rm *.class

debug: GuessingGame.class
	jdb GuessingGame.java