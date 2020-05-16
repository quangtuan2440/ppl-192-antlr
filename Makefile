compile: Chat.g4
	antlr4 $<

build:
	javac Chat*.java

test:
	java org.antlr.v4.gui.TestRig Chat chat 

clean:
	rm *.class *.java *.interp *.tokens
