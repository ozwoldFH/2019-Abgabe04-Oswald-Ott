![image](https://user-images.githubusercontent.com/48798254/59568400-74b5eb80-907a-11e9-8ba9-83e4807de5ed.png) 

# Lab Report Test Automatisierung
Abgabe 04
George Oswald
Clemens Ott
Repository: [https://github.com/ozwoldFH/2019-Abgabe04-Oswald-Ott](https://github.com/ozwoldFH/2019-Abgabe04-Oswald-Ott)

## Vorgehen
Diese Übung verbindet alle vorherigen Übungen in einer. Wir nehmen zuerst die Queue Vorlage vom Professor Ulm ([https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Queue](https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Queue)).
#
Zuerst erstellen wir eine Checkliste als  [README.md](https://github.com/ozwoldFH/2019-Abgabe04-Oswald-Ott/blob/master/README.md) auf unserem Repository basierend auf der Aufgabenstellung dieser Übung. 
#
Danach müssen wir **3 Fehler** im Source Code finden. Die Bilder zeigen den oberen falschen Code mit dem unteren ausgebesserten Code.

![image](https://user-images.githubusercontent.com/48798254/59568380-2f91b980-907a-11e9-8804-363749214dd9.png)
![image](https://user-images.githubusercontent.com/48798254/59568449-2523ef80-907b-11e9-9200-dc8a2eb9f0c7.png)

Ähnliches unten. Das linke Bild zeigt eine unnötige Zuweisung. Rechts wird die Zeile einfach gelöscht.

![image](https://user-images.githubusercontent.com/48798254/59568454-3a991980-907b-11e9-953a-96078daf5278.png) 
![image](https://user-images.githubusercontent.com/48798254/59568458-3f5dcd80-907b-11e9-8abf-c4ce97fe79f4.png)

Das erste Bild zeigt eine gleiche Zuweisung auf sich selbst. Unten nehmen wir den korrekten Parameter und fügen noch ein „this.“ hinzu, um Verwechslungen zu vermeiden.
![image](https://user-images.githubusercontent.com/48798254/59568461-52709d80-907b-11e9-9940-1b2877670c71.png)
![image](https://user-images.githubusercontent.com/48798254/59568464-57cde800-907b-11e9-81a7-baa904d16cd2.png)

Später haben wir noch ein paar Zeilen geändert in Zusammenhang mit null values.

![image](https://user-images.githubusercontent.com/48798254/59568473-661c0400-907b-11e9-8678-a3660932667b.png) 
![image](https://user-images.githubusercontent.com/48798254/59568475-6ae0b800-907b-11e9-8643-f625bf089fe8.png)
#
Wir haben ein Interface Queue gegeben und müssen die **StringQueue** Klasse implementieren.

Unsere Aufgabe bestand auch, dass wir für jede Klasse und jede Methode ein Kommentar hinzufügen um mittels Javadoc eine API Dokumentation zu erzeugen. Mit IntelliJ können wir unter **„Tools…“ > „Generate JavaDoc…“**. Javadoc Kommentare fangen mit /** an und hören mit */ auf. Hier ein Ausschnitt von der StringQueue Klasse im Javadoc:

![image](https://user-images.githubusercontent.com/48798254/59568497-b5623480-907b-11e9-8424-0c69675601b9.png)

Da Tests sehr wichtig sind in der Softwareentwicklung wurde anschließend die **StringQueueTest** Klasse erstellt, die wir auch mi entsprechenden Javadoc Kommentaren versehen haben. Diese werden werden ebenfalls automatisch generierte. Das untere Bild zeigt einen Ausschnitt:

![image](https://user-images.githubusercontent.com/48798254/59568503-cd39b880-907b-11e9-9935-e124b4bdc24e.png)
#
In der **pom.xml** Datei haben wir unsere Entwickler Informationen aktualisiert. Zusätzlich haben wir noch eine Logging Bibliothek gebraucht (log4j) und haben es als Maven Dependecy hinzugefügt.

![image](https://user-images.githubusercontent.com/48798254/59568509-daef3e00-907b-11e9-92e8-ba064e0217f1.png)
![image](https://user-images.githubusercontent.com/48798254/59568513-e3477900-907b-11e9-9510-30c8fc4b089c.png)
#
**Log4j (Version 2)** wurde hinzugefügt. Als Referenz haben wir das Stack Beispiel vom Herrn Professor Ulm genommen. Es ist ein statischer Logger der ständig auf die Konsole schreibt. Darüber hinaus haben wir ein properties File genutzt, um den Logger zu konfigurieren. Für jeden Methoden Aufruf und für jeden Error soll eine Lognachricht angezeigt werden. Hier das Ergebnis:

![image](https://user-images.githubusercontent.com/48798254/59568521-f4908580-907b-11e9-8c3e-c32d34ec5823.png)
#
Maven Site Dokumentation soll Javadoc Code und Testklasse enthalten, sowie ein Menü auf eine manuell erstellte Seite, welches die Queue besser erläutert, erstellt werden. Hier ein Bild der Maven Site Dokumentation:

![image](https://user-images.githubusercontent.com/48798254/59568526-03773800-907c-11e9-9027-81ec1959a06e.png)

Wird Maven Site gestartet, dann werden noch einige Plugins runtergeladen (erster Start - automatisch von Maven).

![image](https://user-images.githubusercontent.com/48798254/59568528-11c55400-907c-11e9-8bf6-275cb99a5895.png)
#
Anschließend hier noch mindestens 3 Zeilen Codeblock in Python und mindestens 3 Zeilen Codeblock in Java mittels Github Flavor:
```python
number1 = 2
number2 = 4
sum = number1 + number2
print(sum)
``` 
```java
public class MyClass {
    public static void main(String args[]) {
        int number1 = 2;
        int number2 = 4;
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
```

## Links / Literatur
[https://elearning.fh-joanneum.at/pluginfile.php/39926/mod_resource/content/0/Konfigurationsmanagement%20Vertiefende%20Gesamtwiederholung%20Arbeitsauftr%C3%A4ge%2020190528.pdf](https://elearning.fh-joanneum.at/pluginfile.php/39926/mod_resource/content/0/Konfigurationsmanagement%20Vertiefende%20Gesamtwiederholung%20Arbeitsauftr%C3%A4ge%2020190528.pdf)

[https://github.com/michaelulm/softwareconfiguration-management/tree/master/test-automation/Queue](https://github.com/michaelulm/softwareconfiguration-management/tree/master/test-automation/Queue)

[https://www.oracle.com/technetwork/articles/javase/index-137868.html](https://www.oracle.com/technetwork/articles/javase/index-137868.html)

[https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Stack](https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/Stack)