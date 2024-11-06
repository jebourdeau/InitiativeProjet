import React, { useState } from 'react';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';

const Rendezvous = () => {
const [date, setDate] = useState(new Date());

const onChange = (newDate) => {
setDate(newDate);
};

return (
<div>
    <h1>Mon Calendrier de Rendez-vous</h1>
    <Calendar onChange={onChange} value={date} />
    <p>Date sélectionnée : {date.toDateString()}</p>
</div>
);
};

export default Rendezvous;
