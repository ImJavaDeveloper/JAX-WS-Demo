# JAX-WS-Demo
JAX-WS stands for Java API for XML Web Services. JAX-WS is XML based Java API to build web services server and client application


SOAPPublisher.java
Just run the above program and your web service will be published at the given endpoint in the program. 

We can access it’s WSDL document by adding ?wsdl to the endpoint url as shown in below image.

Hit Below URL To Check Generated WSDL
http://localhost:8888/ws/person?wsdl

Here is the WSDL code, we will use some of the values from these while writing the client code.

SOAPPublisherClient.java
Here is a client program where we are invoking our JAX-WS example web service.

JAX-WS Client Program
If you look at the  program(SOAPPublisherClient), we are using the server code itself . However web services just expose WSDL and third party applications don not have access to these classes. So in that case, we can use wsimport utility to generate the client stubs. This utility comes with standard installation of JDK. Below image shows what all java classes we get when we run this utility.

<pre>
wsimport -s . http://localhost:8888/ws/person?wsdl


C:\Users\Rahat>wsimport -s . http://localhost:8888/ws/person?wsdl
parsing WSDL...



Generating code...


Compiling code...


Copy Below Code and paste in client code

C:\Users\Rahat\com\java\webservice\jaxws\service>
 Directory of C:\Users\Rahat\com\java\webservice\jaxws\service

03/27/2019  11:51 PM               653 ObjectFactory.class 
03/27/2019  11:51 PM             1,271 ObjectFactory.java 
03/27/2019  11:51 PM               280 package-info.class 
03/27/2019  11:51 PM               139 package-info.java 
03/27/2019  11:51 PM               939 Person.class 
03/27/2019  11:51 PM             2,134 Person.java 
03/27/2019  11:51 PM               900 PersonArray.class 
03/27/2019  11:51 PM             1,886 PersonArray.java 
03/27/2019  11:51 PM             1,853 PersonService.class 
03/27/2019  11:51 PM             2,369 PersonService.java 
03/27/2019  11:51 PM             2,456 PersonServiceImplService.class  
03/27/2019  11:51 PM             3,383 PersonServiceImplService.java 
              12 File(s)         18,263 bytes
               2 Dir(s)  29,514,031,104 bytes free
               
               </pre>



