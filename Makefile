build: compile
	javac tut2*.java

compile: tut2.g4
	antlr4 $<

test: build
	cat test.txt | java org.antlr.v4.gui.TestRig tut2 mc -gui 

tokens:
	java org.antlr.v4.gui.TestRig tut2 tut2 -tokens

clean:
	rm *.class *.java *.interp *.tokens
