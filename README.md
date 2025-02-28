Artemis Financial is a financial company that is required to provide enhanced security for its web application. The company needs to utilize HTTPS and TLS encryption to keep sensitive data secure. Customer data protection is imperative and must be protected from vulnerabilities. You need to keep their data safe from injection attacks, leaks, and other vulnerabilities. 


I conducted an OWASP Dependency check that thoroughly inspected the web application. The dependency check identified insecure password handling. I was able to mitigate injection risks at the /hash endpoint. I also utilized HTTPS and authentication with authorization to secure API communication with spring security.  


Secure coding and practice is important to prevent data breaches, cyberattacks, and company financial loss. It helps companies maintain regulatory compliance which helps ensure company reputation. If customer data is compromised, you will end up with eroded user trust. In the end it helps reduce downtime which in turn increases a company’s financial stability. 


The most challenging part of the security process was the implementation of SAN attribute integrated with the SSL certificate. Ensuring the certificate supported both localhost and an IP with matching all the information provided within application.properties required hours of troubleshooting. I tested multiple times on different web browsers to ensure secure HTTPS enforcement. This helped increase my understanding of TLS security and keystore management. 


I utilized spring security for authentication. I removed all hardcoded passwords. Then lastly enforced HTTPS and TLS encryption with the use of certificates. In the future I would recommend regular OWASP testing weekly to continually assess vulnerabilities. This way you can continually mitigate them. 


I ran the unit for functionality. After refactoring the code, I reran all security scans using OWASP to ensure no new vulnerabilities were introduced. Utilizing keystore.jks with TLS encryption will be helpful in future projects to ensure secure connections on webpages. Continued OWASP dependency checks for continued security mitigation. Also protecting APIs with spring security authentication and authorization. 


I would showcase my


•	Vulnerability Assessment report
•	Use of HTTPS and TLS encryption with keystore.jks certificate.
•	Utilization of Spring Security for authentication and authorization, to secure APIs
•	My application running with no errors after refactoring code. 
