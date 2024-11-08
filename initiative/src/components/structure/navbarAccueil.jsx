import { Link } from 'react-router-dom';
import "../../styles/navbarAccueil.css";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';
import { FaTools, FaCamera, FaCalendarAlt } from 'react-icons/fa';
import { useState } from 'react';

export const NavbarAccueil = () => {
    const [dropdownVisible, setDropdownVisible] = useState(false);

    const toggleDropdown = () => {
        setDropdownVisible(!dropdownVisible);
    };

    return (
        <nav className='navbar'>
            <ul className='nav-links'>
                <li><Link to="/" title="Accueil">Accueil</Link></li>
                <li><Link to="/messagerie" title="Messagerie">Messagerie</Link></li>
                <li><Link to="/profils" title="Profils">Découvrir des Profils</Link></li>
                <li>
                    <span onClick={toggleDropdown} className='dropdown-toggle'>
                        Boîte à Outils
                    </span>
                    {dropdownVisible && (
                        <ul className='dropdown-menu'>
                            <li>
                                <Link to="/outils" title="Outils">
                                    <FaTools /> Outils
                                </Link>
                            </li>
                            <li>
                                <Link to="/photos" title="Photos">
                                    <FaCamera /> Photos
                                </Link>
                            </li>
                            <li>
                                <Link to="/rendezvous" title="Rendez-vous">
                                    <FaCalendarAlt /> Rendez-vous
                                </Link>
                            </li>
                        </ul>
                    )}
                </li>
                <li><Link to="/contact" title="Contact">Contact</Link></li>
                <li><Link to="/apropos" title="A propos">A Propos</Link></li>
            </ul>
            <ul className='login'>
                <li><p>
                    <FontAwesomeIcon className='user' icon={faUser} />
                    <Link to="/login">Connexion</Link></p>
                </li>
                <li><p>
                    <FontAwesomeIcon className='user' icon={faUser} />
                    <Link to="/register">Inscription</Link></p>
                </li>
            </ul>
        </nav>
    );
};