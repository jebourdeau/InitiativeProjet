import React, { useState } from 'react';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';
import "../../../styles/rendezvous.css";

const Rendezvous = () => {

    const [date, setDate] = useState(new Date());
    const [time, setTime] = useState('');
    const [selectedDate, setSelectedDate] = useState(null);
    const [appointment, setAppointment] = useState('');

    const handleDateChange = (date) => {
        setDate(date);
        setSelectedDate(date);
    };

    const handleInputChange = (event) => {
        setAppointment(event.target.value);
    };
    const handleTimeChange = (event) => {
        setTime(event.target.value);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        alert(`Rendez-vous fixé pour le ${selectedDate.toLocaleDateString()} : ${appointment}`);
        // enregistrer le rendez-vous
        setAppointment('');
        setTime('');
        setSelectedDate(null);
    };
return (
        <div>
            <h1>Mon Calendrier Personnalisé</h1>
            <Calendar
                onChange={handleDateChange}
                value={date}
            />
            {selectedDate && (
                <form className='fixer_rdv' onSubmit={handleSubmit}>
                    <h2>Fixer un rendez-vous pour le {selectedDate.toLocaleDateString()}</h2>
                    <input
                        type="text"
                        value={appointment}
                        onChange={handleInputChange}
                        placeholder="Entrez les détails du rendez-vous"
                        required
                        className="rdv"
                    />
                    <input
                        type="time"
                        value={time}
                        onChange={handleTimeChange}
                        required
                        className='rdvTime'
                    />
                    <button className='register' type="submit">
                        Enregistrer
                    </button>
                </form>
            )}
        </div>
);
};

export default Rendezvous;
