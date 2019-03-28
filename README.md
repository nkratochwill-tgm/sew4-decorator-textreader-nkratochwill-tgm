# "*Decorator - TextReader*"

## Aufgabenstellung
Die detaillierte [Aufgabenstellung](TASK.md) beschreibt die notwendigen Schritte zur Realisierung.

## Implementierung

### Move TextReader to Interface

#### Vorteile
Da Java- und auch Kotlin-Klassen nur eine Erbung von anderen Klassen erlauben, 
aber mehrere Interfaces implementieren können, ist ein Interface viel flexibler.

"You can declare properties in interfaces. A property declared in an interface can either be abstract, 
or it can provide implementations for accessors." - [Source](https://kotlinlang.org/docs/reference/interfaces.html)

Durch diese Möglichkeit, ersparrt man sich das Objekterstellen in Authentication,Scrambling und Worker.

#### Nachteile

## Quellen
https://kotlinlang.org/docs/reference/interfaces.html
https://en.wikipedia.org/wiki/XOR_cipher