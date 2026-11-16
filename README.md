<<<<<<< HEAD
<img width="323" height="2268" alt="image" src="https://github.com/user-attachments/assets/301fe78c-4106-4279-b7f5-a25704253aab" />
=======
Employee Management Platform
A cloud-native Employee Management Platform built using Spring Boot, Docker, Kubernetes, AWS EC2, and AWS RDS MySQL.

Project Overview
This project demonstrates end-to-end application development, containerization, cloud deployment, observability, and Kubernetes deployment practices.

The application provides REST APIs for managing employee records and showcases modern deployment techniques used in enterprise environments.

Technology Stack
Backend
Java 21
Spring Boot 3
Spring Data JPA
Hibernate
Database
AWS RDS MySQL
Build Tool
Maven
Containerization
Docker
Docker Hub
Container Orchestration
Kubernetes (Minikube)
Cloud Platform
AWS EC2
AWS RDS
Monitoring & Health Checks
Spring Boot Actuator
Liveness Probe
Readiness Probe
Configuration Management
ConfigMap
Secret
envFrom
Architecture
Browser
   |
   v
AWS EC2
   |
   v
Docker Container
   |
   v
Spring Boot Application
   |
   v
AWS RDS MySQL
Kubernetes Architecture
Client
   |
   v
Kubernetes Service
   |
   v
Employee Application Pod
   |
   v
AWS RDS MySQL
Features
Employee Management
Create Employee
Get All Employees
Get Employee by Id
Update Employee
Delete Employee
Cloud Features
Dockerized application
Docker Hub integration
AWS EC2 deployment
AWS RDS integration
Kubernetes deployment
ConfigMap support
Secret support
Reliability Features
Spring Boot Actuator
Health Endpoint
Liveness Probe
Readiness Probe
REST APIs
Get Employees
GET /employees
Create Employee
POST /employees
Request

{
  "name": "Sethu",
  "email": "sethu@test.com",
  "department": "SRE"
}
Response

{
  "id": 1,
  "name": "Sethu",
  "email": "sethu@test.com",
  "department": "SRE"
}
Health Check
Application health can be verified using:

GET /actuator/health
Response

{
  "status": "UP"
}
Docker Commands
Build Image
docker build -t employee-service:v3 .
Run Container
docker run -d \
--name employee-app \
-p 8080:8080 \
employee-service:v3
Docker Hub
Image repository:

spsethu/employee-service:v3
Push image:

docker push spsethu/employee-service:v3
Kubernetes Deployment
Apply deployment:

kubectl apply -f deployment.yaml
Verify pods:

kubectl get pods -n employee
Verify services:

kubectl get svc -n employee
AWS Deployment
EC2
Application deployed on:

Ubuntu EC2 Instance
Docker Runtime
Spring Boot Container
RDS
MySQL database hosted on:

AWS RDS MySQL
Persistent storage
Survives container restart
Persistence Validation
Validated that employee data persists after:

docker restart employee-app
This confirms the application is using AWS RDS MySQL rather than an in-memory H2 database.

Project Learning Outcomes
Through this project I gained hands-on experience with:

Spring Boot REST APIs
Maven builds
Docker image creation
Docker Hub repositories
Kubernetes deployments
ConfigMaps
Secrets
Health Probes
AWS EC2
AWS RDS MySQL
Application troubleshooting
Container-based deployment
Future Enhancements
GitHub Actions CI/CD
Prometheus Monitoring
Grafana Dashboards
AWS Load Balancer
AWS EKS
AppDynamics Integration
Authentication & Authorization
Author
Sethu P

Senior IT Professional with experience in:

Site Reliability Engineering (SRE)
Monitoring & Observability
Cloud Platforms
Application Performance Management
GitHub Repository:

https://github.com/<your-github-username>/employee-management-platform
>>>>>>> 004ba34 (Updated README)
