# JEE-Activite-3
Le but de cette activité est de s’entrainer aux concepts déjà vues dans l’activité précédente (Spring MVC, Spring Data JPA, le Mapping relationnel objet…) ainsi que se familiariser avec l’utilisation du « Thylemeaf » qui sert à visualiser les données dans un environnement web en utilisant l’HTML.

### Travail à faire ###

Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :
- Afficher les patients
- Faire la pagination
- Chercher les patients
- Supprimer un patient
- Faire des améliorations supplémentaires.

Vidéo à utiliser comme ressource principale :  https://www.youtube.com/watch?v=Zaf3XIP2wss

### Présentation de Thymeleaf ### 

Thymeleaf est un template engine (moteur de rendu de document) écrit en Java. Principalement conçu pour produire des vues Web, il fournit un support pour la génération de documents HTML, XHTML, JavaScript et CSS (voire de n’importe quel format texte).
-	Il permet de créer des templates qui respectent le format du document. Si vous écrivez un template pour une page HTML, le template sera une page HTML valide.
-	Il permet de fournir des valeurs par défaut dans un template. On peut ainsi concevoir des templates pour un site Web avec des données d’exemple et le site reste navigable hors ligne comme un simple site statique. Cela est particulièrement utile si vous travaillez en collaboration avec des designers Web ou si vous voulez réaliser un maquettage de votre site.
-	Il s’intègre parfaitement dans une application Spring puisque vous pourrez utiliser le langage d’expression de Spring (SpEL) pour dynamiser vos templates.
-	Il est facile à apprendre.

![1](https://user-images.githubusercontent.com/60039200/232335930-dd0b459b-45b2-4965-8064-765c8bd8a4df.PNG)

### La configuration du projet ### 
- SDK : 1.8 Oracle OpenJDK version 18.0.2
- Java : 17
- Type : Maven 
- Packaging : Jar 

### Les dépendances utilisées ### 
- Lombok : Un outil de bibliothèque Java qui génère du code pour minimiser le code ‘boilerplate’. La bibliothèque remplace le code ‘boilerplate’ par des annotations faciles à utiliser (Exemples : @NoArgsConstructor, @Getter, @Setter…).
- Spring Web : pour créer des applications Web, y compris RESTful, à l'aide de Spring MVC. Utilise Apache Tomcat comme conteneur intégré par défaut.
- Spring DATA JPA : Pour conserver les données dans ‘SQL stores‘ avec Java Persistance API à l’aide de Spring Data et Hibernate. C'est un module qui facilite le ORM basé sur JPA. Il est utilisé avec les bases de données relationnelles.
- H2 Database : Une base de données intégrée, open source et en mémoire. C'est un système de gestion de base de données relationnelle écrit en Java. C'est une application client/serveur et elle est généralement utilisée dans les tests unitaires.
- MySQL : MySQL est l'un des systèmes de bases de données relationnelles les plus populaires et il est souvent utilisé dans les applications Spring Boot.
- Thymeleaf : Un moteur de modèle Java moderne coté serveur qui nous permet d’afficher correctement des pages HTML qui peuvent fonctionner comme des prototypes statiques.

### L'interface de l'Output et les fonctionnalités implémentées ### 

- La page d'acceuil : 

![11](https://user-images.githubusercontent.com/60039200/232345014-0d11f43b-6537-4fc7-8859-d772d0310e70.PNG)

- La pagination :

![22](https://user-images.githubusercontent.com/60039200/232345017-0123cffa-272c-426a-890c-9582c9ecb705.PNG)

- La recherche avec un mot clé : 

![33](https://user-images.githubusercontent.com/60039200/232345020-ca299525-1bec-48bf-ac6f-e5280589f689.PNG)

- La pagination avec la recherche d'un mot clé : 

![44](https://user-images.githubusercontent.com/60039200/232345021-cd9a7884-7e21-4c79-a3bd-3ba4d715c092.PNG)

- La suppression d'un patient : 

![55](https://user-images.githubusercontent.com/60039200/232344817-df3236b3-4afb-454d-967e-c13f03a1d557.PNG)

![66](https://user-images.githubusercontent.com/60039200/232344827-02e8bdd8-c5c9-4839-aa8c-e77f16f9606f.PNG)



