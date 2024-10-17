import logo from "../assets/img/Nouvelle_Aquitaine-Logo-Reseau_Initiative-RVB_1.webp"
import "../styles/footer.css";

const Footer = () => {
    return (
        <div>
            <footer className="footer-content">
                <div >
                <p>Suivez-nous sur les réseaux sociaux</p>
                <p>Contact: info@initiative-deux-sevres.fr</p>
                <p>&copy; 2024 Initiative Deux Sèvres</p>
                </div>
                <img src= {logo} alt="initiative" className="logo" />
            </footer>
        </div>
    );
};

export default Footer;