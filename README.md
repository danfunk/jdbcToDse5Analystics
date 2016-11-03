
This is a bare-bones implementation of connecting to the demo DSE Analytics server through a JDBC Connection.

To get this working your will need to:

  1. Download and unzip the Simba driver from DataStax
     https://academy.datastax.com/downloads/download-drivers
     Extract this to a directory called simba_libs in the current system.

  2. Start up the DSE Analytics demo.
     https://docs.datastax.com/en/datastax_enterprise/4.5/datastax_enterprise/spark/sparkWSDemo.html

  3. Run the project with gradle:
     ./gradlew run


