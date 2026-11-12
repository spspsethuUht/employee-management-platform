Day 3 Kubernetes Deployment
Completed
Created Namespace
Created Deployment
Created Service
Loaded Docker Image into Minikube
Fixed ErrImageNeverPull
Pod Running
Service Exposed
Verification
kubectl get pods -n employee

Result:

1/1 Running

Browser Access
minikube service employee-service -n employee

Generated URL:

http://127.0.0.1:39315/employees

Response:

[]
