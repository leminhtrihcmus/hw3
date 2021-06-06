build:
	cd server && $(MAKE) build
	cd client && $(MAKE) build

run:
	docker-machine regenerate-certs --client-certs
	docker-compose up

test:


stop:
	docker-compose down