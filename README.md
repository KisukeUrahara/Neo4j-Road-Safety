# Neo4j-Road-Safety
Neo4j project on a UK Road Safety Dataset mounted on to my graph database .Mapping of nodes and relationships to POJO domain classes. Easy to run ontological analysis.
As mentioned before, this project ironically wasn’t just a simple implementation of an algorithm with some input and output data and code which can be found in ample sites online. This was a research project aimed at understanding how meaningful algorithms work on graph elements in a graph database by using a Maven front-end for the database.
Dataset link: http://data.gov.uk/dataset/road-accidents-safety-data/resource/13aea84b-0ffd-44bb-8a8f-6e98f14fc533


1.We first mounted the “Road Safety dataset of United Kingdom in 2011” csv files as a graph database into Neo4J using the “LOAD AS CSV” command. There were 7 files which we had to import and dynamically link the attributes with different entities to provide the needed Node-Property setup for the dataset.

2.After going through a lot of online recommendations, we decided that the best UI we could provide for a Neo4J project was through a Maven project. So we set up the infrastructure for a Spring project using Maven as the build system. We had to download, install and configure a lot of Maven dependencies for Spring (as seen in the pom.xml file).

3.We then had to scan the whole database and come up with a set of domain classes for each entity in the database. To set up an environment we learnt that we had to use annotations to design the GraphEntity classes. [ Domain path: com\tp\springdata\neo4j\domain ]

4.Then we provided a repository interface infrastructure for the basic functionalities of each of the domain classes. We resorted to the repository infrastructure because Spring removed the need to write boilerplate code for simple operations on each domain class.[ Repository path: com\tp\springdata\neo4j\dao ]

5.  We then developed service layer artifacts for the Repositories. We provided service component interfaces and their respective implementations for the DAO layer. [ Services path: com\tp\springdata\neo4j\service ]

6.	To run Spring based applications we needed to provide XML configurations for our entire project. The whole project had to defining xml files. One was pom.xml which set up the Maven build and the other was googleprofile.xml which configured the Spring part, in which I had to mention the namespace, Neo4j Schema definition (XSD file) ,database and the graph entities location, DAO interfaces base package, etc.

7.Then I ran the test application to check if the database connection was solid (had to be done when the web browser connection port was turned off).

8.	After testing the basic CRUD operations, we decided that instead of running traversals and meaningless textbook graph algorithms that don’t provide us meaningful data, we would run traversals that showed decent analytical results from the data.

9.	So instead of using the TraversalDescription class and display different traversals, I spent my time learning CQL – Cypher Query Language made specifically for graph databases so that I could perform analytics. In the long run, we may have lost our way as the project ended up being a database analytics project rather than an Analysis and Design of Algorithms project, but nevertheless it was done keeping in mind that this was an opportunity to do research and not a mere coding example to get my grades.

10.	Finally we ran cypher scripts to find out the most accident prone gender, age-band, vehicle model etc. and obtained the data in tabular form (as reading information in the tabular form is a more compact way of representing it).
