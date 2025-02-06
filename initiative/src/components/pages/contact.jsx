import { useState } from "react";
import "../../styles/contact.css"



export const Contact = () => {

    const [formData, setFormData] = useState({
    name: '',
    email: '',
    message: ''
    });
    
    const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
        ...formData,
        [name]: value
    });
    };
    
    const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Form Data Submitted:', formData);
    };

return (

    <form onSubmit={handleSubmit}>
    <div className="champ_nom">
    <label title="name">Nom:</label>
    <input
        type="text"
        placeholder="entrer votre Nom"
        id="name"
        name="name"
        value={formData.name}
        onChange={handleChange}
        required
    />
    </div>
    <div>
    <label title="email">Email:</label>
    <input
        type="email"
        placeholder="votre-mail@email.fr"
        id="email"
        name="email"
        value={formData.email}
        onChange={handleChange}
        required
    />
    </div>
    <div>
    <label title="message">Message:</label>
    <textarea
        id="message"
        name="message"
        placeholder="entrer votre texte ici"
        value={formData.message}
        onChange={handleChange}
        required
    />
    </div>
    <button type="submit">Envoyer</button>
</form>
);
};





