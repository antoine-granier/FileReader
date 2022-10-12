# Filereader

## Lancement

>Le programme peut être lancé via la commande `java Main` dans le dossier `out/production/FileReader` dans ce cas la le programme utilisera le fichier texte par défaut.
> 
> Pour utiliser son propre fichier, utiliser la commande `java Main filePath` toujours dans `out/production/FileReader`.
> 
> Ou peut être lancé via un IDE.

## Initialisation

>Le programme initialise trois lecteurs (normal, à l'envers et palindrome) se basant sur le chemin fourni.

## Fonctionnement

>Afin de pouvoir lire un fichier, il faut utiliser la méthode `read()` sur un lecteur. Cette dernière stockera le contenu du fichier dans une `ArrayList<String>`.
> Pour afficher ce contenu de la manière que le souhaite, il suffit d'appeler la méthode `display()` sur le type de lecteur que l'on souhaite.