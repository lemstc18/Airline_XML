const baseURL: string = "http://localhost:8080/Airline_XML-1.0-SNAPSHOT/";

interface Airline {
    routes: {
        route: {
            departure: string;
            destination: string;
            flights: {
                flight: {
                    flightNumber: number;
                    departureTime: Date;
                    duration: number;
                    pilot: {
                        title: string;
                        gender: string;
                        name: string;
                    }
                }[]
            }
        }[]
    }
}

const onGetRoutes = (): void => {
    fetch(`${baseURL}api/airlines`)
        .then(response => {
            return response.json() as Promise<Airline>;
        })
        .then(airline => {
            const dropdown = document.getElementById("dropdown") as HTMLSelectElement;

            // Clear existing options
            dropdown.innerHTML = "";

            // Create a new option for each route
            airline.routes.route.forEach(route => {
                const option = document.createElement("option");
                option.text = `${route.departure} - ${route.destination}`;
                dropdown.add(option);
            });
        })
        .catch(error => {
            console.error(error);
        });
};