# Employee Management Platform

A full-stack cloud-native Employee Management Platform built using Spring Boot, AWS RDS MySQL, Docker, AWS EC2, Prometheus, Grafana, and GitHub Actions.

---

## Project Overview

This project demonstrates end-to-end application development, containerization, cloud deployment, observability, monitoring, and Continuous Integration (CI).

The application enables employee management through a web-based user interface and REST APIs, and is deployed on AWS using Docker containers and a persistent MySQL database.

---

## Architecture

```text
Browser
    ↓
HTML / CSS / JavaScript Frontend
    ↓
Spring Boot REST APIs
    ↓
Spring Data JPA
    ↓
AWS RDS MySQL

Observability:
Spring Boot Actuator
    ↓
Prometheus
    ↓
Grafana

CI Pipeline:
GitHub
    ↓
GitHub Actions
```

---

## Technology Stack

### Frontend

- HTML5
- CSS3
- JavaScript

### Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate

### Database

- AWS RDS MySQL

### Build Tool

- Maven

### Containerization

- Docker
- Docker Hub

### Cloud

- AWS EC2
- AWS RDS

### Monitoring & Observability

- Spring Boot Actuator
- Micrometer
- Prometheus
- Grafana

### DevOps

- Git
- GitHub
- GitHub Actions

### Kubernetes

- Deployment YAML
- ConfigMap
- Secret
- Liveness Probe
- Readiness Probe

---

## Features

### Employee Management

- Create Employee
- Search Employee by ID
- Update Employee
- Delete Employee
- List Employees

### Cloud Features

- Dockerized Application
- AWS EC2 Deployment
- AWS RDS Integration
- Persistent Data Storage

### Observability

- Application Health Monitoring
- JVM Metrics
- Database Connection Pool Metrics
- Startup Duration Metrics
- Prometheus Integration
- Grafana Dashboards

### CI/CD

- Automated Build Verification
- JDK Setup
- Maven Build
- JAR Packaging
- GitHub Actions Workflow

---

## REST APIs

### Get All Employees

```http
GET /employees
```

### Get Employee By ID

```http
GET /employees/{id}
```

### Create Employee

```http
POST /employees
```

Example Request

```json
{
  "name": "Sethu",
  "email": "sethu@test.com",
  "department": "SRE",
  "salary": 100000
}
```

### Update Employee

```http
PUT /employees/{id}
```

### Delete Employee

```http
DELETE /employees/{id}
```

---

## Monitoring Endpoints

### Health Endpoint

```http
GET /actuator/health
```

### Prometheus Metrics

```http
GET /actuator/prometheus
```

---

## Application Screenshots

### Employee Dashboard

![Employee Dashboard](screenshots/16-Adding-Employee-Record.png)

### Employee Update

![Employee Update](screenshots/17-Updating-Employee-Record.png)

### Employee Search

![Employee Search](screenshots/18-Searching-Employee-Record.png)

---

## Prometheus Monitoring

The application exposes metrics through Spring Boot Actuator and Micrometer.

Examples:

- Database Connection Pool Usage
- JVM Metrics
- Startup Duration
- Thread Metrics
- Garbage Collection Metrics

### Prometheus Metrics

![Prometheus Metrics](prometheus-grafana-screenshots/01-Prometheus-Actuator-Metrics.png)

---

## Grafana Dashboards

Implemented Grafana dashboards for:

- Database Connections
- JVM Memory Monitoring
- JVM Garbage Collection
- Application Startup Time
- Thread Utilization

### Grafana Monitoring Dashboard

![Grafana Dashboard](prometheus-grafana-screenshots/03-Employee-App-Startup-Time-Duration.png)

---

## GitHub Actions CI

Implemented GitHub Actions Continuous Integration workflow to automatically build and validate the project on every push.

### Build Pipeline

- Checkout Source Code
- Setup JDK 21
- Maven Build
- Package Spring Boot Application

### GitHub Actions Build Success

![GitHub Actions](github-actions-screenshots/01-github-action.png)

---

## AWS Deployment

### EC2

- Ubuntu EC2 Instance
- Docker Runtime
- Spring Boot Container

### RDS

- AWS RDS MySQL
- Persistent Data Storage
- Survives Docker Container Restart

---

## Persistence Validation

Validated application persistence with the following test:

1. Added Employee
2. Restarted Docker Container
3. Verified Data Still Exists

This confirms successful integration with AWS RDS MySQL.

---

## CI/CD Pipeline

GitHub Actions automatically:

- Builds the Spring Boot application
- Creates a Docker image
- Pushes the image to Docker Hub

Docker Hub Repository:

https://hub.docker.com/r/spsethu/employee-service
---






## Project Learnings

- Full-Stack Web Development
- REST API Design
- Spring Boot Development
- Docker Containerization
- AWS Cloud Deployment
- Kubernetes Fundamentals
- Prometheus Monitoring
- Grafana Dashboards
- GitHub Actions CI
- Cloud-Based Persistence
- Observability Engineering


---
## Automated CI/CD Pipeline

Git Push
→ GitHub Actions
→ Docker Build
→ Docker Hub
→ AWS EC2 Automatic Deployment
---
## Terraform Infrastructure

Implemented Terraform Infrastructure as Code (IaC) for AWS.

Features:
- AWS Provider Configuration
- EC2 Infrastructure Definition
- Terraform Init
- Terraform Validate
- Terraform Plan
- AWS IAM User Integration

Screenshots:
- AWS Configure
- Terraform Init & Validate
- Terraform Plan
---

## Future Enhancements

- Grafana Alert Rules
- Spring Security Integration
- Role-Based Access Control
- Kubernetes Monitoring

---

---

## Terraform Security Group Provisioning (v2.2)

As part of Employee Management Platform v2.2, Infrastructure as Code (IaC) capabilities were extended using Terraform to provision AWS Security Groups. A dedicated Security Group named **employee-sg** was created and deployed to AWS using Terraform. The Security Group allows secure SSH access on port 22 and application access on port 8080. Terraform validation, planning, and apply workflows were successfully executed, and the resulting Security Group was verified directly in the AWS Console. This implementation demonstrates hands-on experience with AWS networking, Terraform state management, cloud security configuration, and automated infrastructure provisioning.

### Security Group Configuration

| Port | Protocol | Purpose |
|--------|----------|----------|
| 22 | TCP | SSH Administration |
| 8080 | TCP | Employee Management Application |

### Terraform Commands Executed

```bash
terraform init
terraform validate
terraform plan
terraform apply
```

### Provisioning Result

```text
Apply complete! Resources: 1 added, 0 changed, 0 destroyed.

security_group_id = sg-0e05e53cb57724bfe
```

### Terraform Security Group Screenshots

#### Terraform Apply Successful

![Terraform Security Group Apply](terraform-screenshots/05-terraform-apply-securitygroup.png)

#### AWS Security Group Verification

![AWS Security Group Created](terraform-screenshots/06-aws-security-group-created.png)

---

---
### v2.2

- AWS Security Group Definition using Terraform
- Terraform Apply Execution
- Security Group Provisioning
- AWS Security Group Validation
- Infrastructure as Code Enhancement
---


---
## Terraform Elastic IP & Infrastructure Variables (v2.3)

As part of v2.3, Terraform configurations were enhanced by introducing reusable variables and Elastic IP infrastructure definitions. Variables were used to externalize AWS region and EC2 instance settings, improving maintainability and reusability. An AWS Elastic IP resource was defined using Terraform to support future static public IP assignment requirements and production-ready deployment architectures.

### Terraform Variables

- AWS Region
- EC2 Instance Type

### Elastic IP Benefits

- Static Public IP Address
- Consistent Access Endpoints
- Supports CI/CD Deployments
- Improves Production Readiness
---
## AWS Auto Scaling Group (v2.4)

To improve scalability and service availability, an AWS Auto Scaling Group (ASG) was implemented. A Launch Template was created to define EC2 instance configuration, including AMI, instance type, key pair, and security group settings.

### Auto Scaling Configuration

- Launch Template: employee-app-template
- Minimum Capacity: 1
- Desired Capacity: 1
- Maximum Capacity: 2

### Scaling Policy

- Target Tracking Policy
- Average CPU Utilization

### Benefits

- Automatic EC2 provisioning
- Self-healing infrastructure
- Improved availability
- Horizontal scaling capability
---
## Application Load Balancer (v2.5)

As part of v2.5, an AWS Application Load Balancer (ALB) was implemented to provide scalable and highly available access to the Employee Management Platform. A target group was configured to route traffic to Auto Scaling Group instances running the Spring Boot application on port 8080.

### Components Implemented

- Application Load Balancer (ALB)
- Target Group (employee-app-tg)
- Auto Scaling Group Integration
- Health Check Monitoring

### Configuration

- Listener: HTTP Port 80
- Target Port: 8080
- Health Check Path: /actuator/health
- Load Balancer Type: Internet-facing

### Benefits

- Traffic Distribution
- High Availability
- Auto Scaling Integration
- Automated Health Monitoring
- Production-Ready Cloud Architecture

### Validation

The Application Load Balancer successfully routed traffic to healthy Auto Scaling Group instances. Application pages and Spring Boot Actuator health endpoints were accessible through the ALB DNS endpoint.
---
---
## Author

**Sethu P**

Senior IT Professional | SRE Trainer | Cloud & Observability Enthusiast

GitHub Repository:

https://github.com/spspsethuUht/employee-management-platform
