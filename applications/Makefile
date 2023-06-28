start:
	mvn clean install -Dmaven.test.skip=true -f api-catalog/
	mvn clean install -Dmaven.test.skip=true -f api-provider-alpha/
	mvn clean install -Dmaven.test.skip=true -f api-provider-beta/
	docker-compose build
	docker-compose up

stop:
	docker-compose down

start-infra:
	docker-compose -f docker-compose-infrastructure.yml build
	docker-compose -f docker-compose-infrastructure.yml up

stop-infra:
	docker-compose -f docker-compose-infrastructure.yml down

.PHONY: start stop start-infra stop-infra
