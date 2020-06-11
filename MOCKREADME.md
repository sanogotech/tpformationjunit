## Unitaire de Base


1.  Setupp  :  BeforeAll


2.  Run  /Exercise :  Call  Service : Calculator.add(x, y)


3.  Asssertions '  Asserttions reponse) // JUNIT5 + AssertJ or Hamcrest


4.  Clean   AfferAll

## Unitaire Mock  : JUNIT5 +  Framework  Mockito ,  EasyMock
1.  Setupp  :  BeforeAll

1.1 ***** Mock (DAO/Reposotry)  simul l'appel/reponse

2.  Run  /Exercise :  Call  Service  ----  DAO/Repository


3.  Asssertions '  Asserttions reponse,  *** verify call)


4.  Clean   AfferAll


## Intégration

1.  Setupp  :  BeforeAll


2.  Run  /Exercise :  Call  Service  ----  DAO/Repository --  DB/ Memoire H2 /MYSQL


3.  Asssertions '  Asserttions reponse)


4.  Clean   AfferAll
