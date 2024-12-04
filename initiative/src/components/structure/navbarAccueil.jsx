import { Link, useNavigate } from 'react-router-dom';
import "../../styles/navbarAccueil.css";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';
import { FaTools, FaCamera, FaCalendarAlt } from 'react-icons/fa';
import { useState } from 'react';

export const NavbarAccueil = () => {
    const [isOpen, setIsOpen] = useState(false);
    const [isMessagerieOpen, setIsMessagerieOpen] = useState(false);
    const [isBoiteOutilsOpen, setIsBoiteOutilsOpen] = useState(false);

    const toggleMenu = () => {
        setIsOpen(!isOpen);
    };

    const toggleMessagerie = () => {
        setIsMessagerieOpen(!isMessagerieOpen);
    };

    const toggleBoiteOutils = () => {
        setIsBoiteOutilsOpen(!isBoiteOutilsOpen);
    };

    const navigate = useNavigate();

    return (
        <nav className="navbar">
            <button className="burger" onClick={toggleMenu}>
                ☰
            </button>
            <ul className={`nav-links ${isOpen ? 'open' : ''}`}>
                <li><Link to="/" title="Accueil">Accueil</Link></li>
                <li>
                    <button className="dropdown-toggle" onClick={toggleMessagerie}>Messagerie</button>
                    <ul className={`dropdown ${isMessagerieOpen ? 'open' : ''}`}>
                        <li><Link to="/messagerie/rediger" title="Rédiger un message">Rédiger un message</Link></li>
                        <li><Link to="/messagerie/consulter" title="Consulter vos messages">Consulter vos messages</Link></li>
                    </ul>
                </li>
                <li><Link to="/profils" title="Profils">Découvrir des Profils</Link></li>
                <li>
                    <button className="dropdown-toggle" onClick={toggleBoiteOutils}>Boite à outils</button>
                    <ul className={`dropdown ${isBoiteOutilsOpen ? 'open' : ''}`}>
                        <li><Link to="/outils" title="Outils"><FaTools /> Outils</Link></li>
                        <li><Link to="/photos" title="Photos"><FaCamera /> Photos</Link></li>
                        <li><Link to="/rendezvous" title="Rendez-vous"><FaCalendarAlt /> Rendez-vous</Link></li>
                    </ul>
                </li>
                <li><Link to="/apropos" title="A propos">A Propos</Link></li>
                <li><Link to="/contact" title="Contact">Contact</Link></li>
            </ul>
            <ul className='login'>
                <li>
                    <p>
                        <FontAwesomeIcon className='user' icon={faUser} />
                        <Link to="/login">Connexion</Link>
                    </p>
                </li>
            </ul>
            <ul className='login'>
                <li>
                    <p>
                        <FontAwesomeIcon className='user' icon={faUser} />
                        <Link to="/register">Inscription</Link>
                    </p>
                </li>
            </ul>
            <ul className='login'>
                <li>
                    <button className="backhome" type="button" onClick={() => navigate(-1)}>Back</button>
                </li>
            </ul>
        </nav>
    );
};