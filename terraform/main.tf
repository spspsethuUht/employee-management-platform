/*
resource "aws_instance" "employee_app" {
  ami           = "ami-04cc7e4039506421f"
  instance_type = "t3.micro"

  tags = {
    Name = "employee-management-server"
  }
}
*/
resource "aws_security_group" "employee_sg" {
  name        = "employee-sg"
  description = "Security group for Employee Management Platform"

  ingress {
    description = "Application Port"
    from_port   = 8080
    to_port     = 8080
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    description = "SSH Access"
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"

    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Name = "employee-sg"
  }
}
