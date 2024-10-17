import { useState } from 'react';
import { Link } from 'react-router-dom';

export const NavbarAccueil = () => {

    const [isOpen, setIsOpen]= useState(false);
    const toggleMenu = () =>{
        setIsOpen(!isOpen);
    }
    return (
        <nav>
            <div className="burger-menu" onClick={toggleMenu}>☰</div>
            <ul className={`nav-links ${isOpen ? 'open' : ''}`}>
                <li><Link to ="/">Accueil</Link></li>
                <li><Link to ="/we">A Propos</Link></li>
                <li><Link to ="/contact">Contact</Link></li>
                <li><Link to ="/login">Connexion / Inscription</Link></li>
            </ul>
            
        </nav>
    );
};
