import axios from 'axios';
import { toast } from 'react-toastify';
import Vector from '../../assets/img/Vector.svg'
import { BASE_URL } from '../../utils/request';
import './styles.css'

type Props = {
    saleId: number;
}

function handleClick(id :number){
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response => {
        toast.info("SMS enviado com sucesso!!!")
    })
}

function NotificationButton( {saleId} : Props) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={Vector} alt="Notificar" />
        </div>
    )
}

export default NotificationButton
