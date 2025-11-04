Verwendete Plattform:
GitHub Actions als CI/CD-Plattform

Automatische Ausführung bei jedem Push in das Repository

Aufbau der Pipeline

Datei: .github/workflows/build.yml

Schritte der Pipeline:

Code aus dem Repository herunterladen (checkout)

Java 17 einrichten

Projekt kompilieren: javac -d bin src/*.java

Tests ausführen: java -cp bin CalculatorTest

GitHub zeigt Build-Ergebnis an (erfolgreich oder fehlgeschlagen)

Verhalten bei einem Push

Bei jedem git push wird der Workflow automatisch gestartet

Der Code wird kompiliert und getestet

Das Ergebnis ist unter dem Reiter Actions auf GitHub sichtbar

Erfolgreiche Tests → grüner Haken, fehlgeschlagene Tests → rotes X

Projektstruktur

Calculator.java: enthält Rechenfunktionen

CalculatorTest.java: überprüft die Funktionen

Main.java: Beispielausführung des Programms
