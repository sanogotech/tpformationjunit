	1. Agile =  Scrum  + XP
	
	2. BDD / Users  Stories / Given  When Then
	
	3.TDD
    Tester une seule unité de code à la fois 
	 
	 Tester toutes les méthodes  “public” /Pareto
	 
	 # Agile  --- US -  Cas de Test -  BDD Given -- TDD - Raport Jacoco -  Pic  Travis/Jenkins - SonarQube
	 MVP
	 
     Ne pas faire d'assertions inutiles 
	 
     Rendre chaque test indépendant des autres 
	 
     “Mock”  tous les services externes 

     Nommez vos tests unitaires de manière claire et cohérente /  ServiceNameTest //Idem :Package
	 
     Écrivez d'abord des tests pour les méthodes qui ont le moins de dépendances 
	 
     
	 
     Visez à ce que chaque méthode de test unitaire effectue exactement une assertion 
	 
     Créez des tests unitaires qui exceptions cibles 
	 
     Utilisez les méthodes d'assertion les plus appropriées. //AsserJ , HamCrest
	 
     Mettez les paramètres d'assertion dans le bon ordre
	 
     Assurez-vous que le code de test est séparé du code de production 
	 
     N'imprimez rien dans les tests unitaires // Remplacer logs par des Assertions !!!
	 
	 
     N'utilisez pas de membres statiques dans une classe de test // BeforeAll
	 
     N'écrivez pas vos propres blocs catch qui n'existent que pour échouer un test 
	 
	 
     Ne vous fiez pas aux tests indirects 
   
     Ne pas ignorer les tests unitaires // Activer 1 cas test + TODO
	 
     Générer des rapports de tests (ex: JACOCO) //Plugin Maven + Plugin  IDE
	 
	 POSTMAN  API  +  Test RestTemplate
