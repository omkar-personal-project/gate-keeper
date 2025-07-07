#!/bin/bash

# *********** THIS IS ONLY FOR LOCAL DEPLOYMENT SUPPORT ************

# Exit on error
set -e

# Load environment variables from .env file
if [ -f .env ]; then
  echo "Loading environment variables from .env file"
  export $(grep -v '^#' .env | xargs)
else
  echo ".env file not found!"
  exit 1
fi

# Start Spring Boot app
./mvnw spring-boot:run
