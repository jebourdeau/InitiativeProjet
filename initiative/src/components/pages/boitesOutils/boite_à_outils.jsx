import { Link } from 'react-router-dom';
import { FaTools, FaCamera, FaCalendarAlt } from 'react-icons/fa';
import "../../../styles/boitesoutils.css";

const Boite_à_outils = () => {
    return (
        <div className="sidebar">
            <ul>
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
        </div>
    );
};

export default Boite_à_outils;
