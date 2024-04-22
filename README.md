# Getting Started

### Reference Documentation

APIs

1. Create Stock for a product in a warehouse/store
2. Update Stock 
3. Get Total Stock from all the warehouses/stores
4. Get Stock from a store

TBC Ring fencing the stock

### Package and create image

docker-compose up -d --build

### Run Postgres for local development in IDE

brew install postgresql@16

This formula has created a default database cluster with:
**initdb --locale=C -E UTF-8 /opt/homebrew/var/postgresql@16**
For more details, read:
https://www.postgresql.org/docs/16/app-initdb.html

postgresql@16 is keg-only, which means it was not symlinked into /opt/homebrew,
because this is an alternate version of another formula.

If you need to have postgresql@16 first in your PATH, run:
**echo 'export PATH="/opt/homebrew/opt/postgresql@16/bin:$PATH"' >> ~/.zshrc**

For compilers to find postgresql@16 you may need to set:
**export LDFLAGS="-L/opt/homebrew/opt/postgresql@16/lib"
export CPPFLAGS="-I/opt/homebrew/opt/postgresql@16/include"**

To start postgresql@16 now and restart at login:
**brew services start postgresql@16**

Or, if you don't want/need a background service you can just run:
**LC_ALL="C" /opt/homebrew/opt/postgresql@16/bin/postgres -D /opt/homebrew/var/postgresql@16**

# Create Pipeline 
https://docs.aws.amazon.com/prescriptive-guidance/latest/patterns/deploy-a-ci-cd-pipeline-for-java-microservices-on-amazon-ecs.html
https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-github-gitclone.html 
